package com.mshdabiola.model

data class UserData(
    val topicIds: List<Int>,
    val integer: Int,
    val yes: Boolean,
    val names: List<String>,
    val maps: Map<String, Boolean>,
    val brandTheme: BrandTheme,
    val themeConfig: ThemeConfig,
)

enum class BrandTheme {
    ThemeDefault, ThemeAndroid
}

enum class ThemeConfig {
    System, Light, Dark
}
