
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.android.test) apply false
    alias(libs.plugins.hilt) apply false

}

//task createSpotlessPreCommitHook() {
//    def gitHooksDirectory = new File("$project.rootDir/.git/hooks/")
//    if (!gitHooksDirectory.exists()) gitHooksDirectory.mkdirs()
//    new File("$project.rootDir/.git/hooks", "pre-commit").text = """
//    #!/bin/bash
//    echo "Running spotless check"
//    ./gradlew spotlessApply --init-script gradle/init.gradle.kts
//"""
//    "chmod +x .git/hooks/pre-commit".execute()
//}
task("anotherTask"){
    doLast {
        val gitHooksDirectory = File("$project.rootDir/.git/hooks/")
        if (!gitHooksDirectory.exists()) gitHooksDirectory.mkdirs()
        File("${project.rootDir}/.git/hooks", "pre-commit").writeText(
            """
    #!/bin/bash
    echo "Running spotless check"
    ./gradlew spotlessApply --init-script gradle/init.gradle.kts
"""
        )
        exec {
            commandLine("chmod","+x", ".git/hooks/pre-commit")
        }
        //   "chmod +x .git/hooks/pre-commit".execute()
    }
}



