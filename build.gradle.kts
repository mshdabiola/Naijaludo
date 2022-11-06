
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.android.test) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.manes)
    alias(libs.plugins.little)

}

versionCatalogUpdate {
    // sort the catalog by key (default is true)
    sortByKey.set(true)
    // Referenced that are pinned are not automatically updated.
    // They are also not automatically kept however (use keep for that).
    keep {

        // keep versions without any library or plugin reference
        keepUnusedVersions.set(true)
        // keep all libraries that aren't used in the project
        keepUnusedLibraries.set(true)
        // keep all plugins that aren't used in the project
        keepUnusedPlugins.set(true)
    }
}
  //  ./gradlew versionCatalogUpdate
//apply("${project.rootDir}/gradle/toml_updater_config.gradle.kts")
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



