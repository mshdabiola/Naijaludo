package com.mshdabiola.designsystem.theme

import androidx.compose.ui.graphics.Color

sealed class MyColors {

    abstract val primaryLight: Color
    abstract val onPrimaryLight: Color
    abstract val primaryContainerLight: Color
    abstract val onPrimaryContainerLight: Color
    abstract val secondaryLight: Color
    abstract val onSecondaryLight: Color
    abstract val secondaryContainerLight: Color
    abstract val onSecondaryContainerLight: Color
    abstract val tertiaryLight: Color
    abstract val onTertiaryLight: Color
    abstract val tertiaryContainerLight: Color
    abstract val onTertiaryContainerLight: Color
    abstract val errorLight: Color
    abstract val onErrorLight: Color
    abstract val errorContainerLight: Color
    abstract val onErrorContainerLight: Color
    abstract val backgroundLight: Color
    abstract val onBackgroundLight: Color
    abstract val surfaceLight: Color
    abstract val onSurfaceLight: Color
    abstract val surfaceVariantLight: Color
    abstract val onSurfaceVariantLight: Color
    abstract val outlineLight: Color
    abstract val outlineVariantLight: Color
    abstract val scrimLight: Color
    abstract val inverseSurfaceLight: Color
    abstract val inverseOnSurfaceLight: Color
    abstract val inversePrimaryLight: Color
    abstract val surfaceDimLight: Color
    abstract val surfaceBrightLight: Color
    abstract val surfaceContainerLowestLight: Color
    abstract val surfaceContainerLowLight: Color
    abstract val surfaceContainerLight: Color
    abstract val surfaceContainerHighLight: Color
    abstract val surfaceContainerHighestLight: Color

    abstract val primaryDark: Color
    abstract val onPrimaryDark: Color
    abstract val primaryContainerDark: Color
    abstract val onPrimaryContainerDark: Color
    abstract val secondaryDark: Color
    abstract val onSecondaryDark: Color
    abstract val secondaryContainerDark: Color
    abstract val onSecondaryContainerDark: Color
    abstract val tertiaryDark: Color
    abstract val onTertiaryDark: Color
    abstract val tertiaryContainerDark: Color
    abstract val onTertiaryContainerDark: Color
    abstract val errorDark: Color
    abstract val onErrorDark: Color
    abstract val errorContainerDark: Color
    abstract val onErrorContainerDark: Color
    abstract val backgroundDark: Color
    abstract val onBackgroundDark: Color
    abstract val surfaceDark: Color
    abstract val onSurfaceDark: Color
    abstract val surfaceVariantDark: Color
    abstract val onSurfaceVariantDark: Color
    abstract val outlineDark: Color
    abstract val outlineVariantDark: Color
    abstract val scrimDark: Color
    abstract val inverseSurfaceDark: Color
    abstract val inverseOnSurfaceDark: Color
    abstract val inversePrimaryDark: Color
    abstract val surfaceDimDark: Color
    abstract val surfaceBrightDark: Color
    abstract val surfaceContainerLowestDark: Color
    abstract val surfaceContainerLowDark: Color
    abstract val surfaceContainerDark: Color
    abstract val surfaceContainerHighDark: Color
    abstract val surfaceContainerHighestDark: Color

    data object Brown : MyColors() {

        override val primaryLight = Color(0xFF8E4D31)
        override val onPrimaryLight = Color(0xFFFFFFFF)
        override val primaryContainerLight = Color(0xFFFFDBCE)
        override val onPrimaryContainerLight = Color(0xFF370E00)
        override val secondaryLight = Color(0xFF77574B)
        override val onSecondaryLight = Color(0xFFFFFFFF)
        override val secondaryContainerLight = Color(0xFFFFDBCE)
        override val onSecondaryContainerLight = Color(0xFF2C160C)
        override val tertiaryLight = Color(0xFF685F30)
        override val onTertiaryLight = Color(0xFFFFFFFF)
        override val tertiaryContainerLight = Color(0xFFF0E3A8)
        override val onTertiaryContainerLight = Color(0xFF211B00)
        override val errorLight = Color(0xFFBA1A1A)
        override val onErrorLight = Color(0xFFFFFFFF)
        override val errorContainerLight = Color(0xFFFFDAD6)
        override val onErrorContainerLight = Color(0xFF410002)
        override val backgroundLight = Color(0xFFFFF8F6)
        override val onBackgroundLight = Color(0xFF231A16)
        override val surfaceLight = Color(0xFFFFF8F6)
        override val onSurfaceLight = Color(0xFF231A16)
        override val surfaceVariantLight = Color(0xFFF5DED6)
        override val onSurfaceVariantLight = Color(0xFF53433E)
        override val outlineLight = Color(0xFF85736D)
        override val outlineVariantLight = Color(0xFFD8C2BA)
        override val scrimLight = Color(0xFF000000)
        override val inverseSurfaceLight = Color(0xFF382E2A)
        override val inverseOnSurfaceLight = Color(0xFFFFEDE7)
        override val inversePrimaryLight = Color(0xFFFFB598)
        override val surfaceDimLight = Color(0xFFE8D6D0)
        override val surfaceBrightLight = Color(0xFFFFF8F6)
        override val surfaceContainerLowestLight = Color(0xFFFFFFFF)
        override val surfaceContainerLowLight = Color(0xFFFFF1EC)
        override val surfaceContainerLight = Color(0xFFFCEAE4)
        override val surfaceContainerHighLight = Color(0xFFF6E4DE)
        override val surfaceContainerHighestLight = Color(0xFFF1DFD9)

        override val primaryDark = Color(0xFFFFB598)
        override val onPrimaryDark = Color(0xFF552008)
        override val primaryContainerDark = Color(0xFF71361C)
        override val onPrimaryContainerDark = Color(0xFFFFDBCE)
        override val secondaryDark = Color(0xFFE7BEAE)
        override val onSecondaryDark = Color(0xFF442A20)
        override val secondaryContainerDark = Color(0xFF5D4035)
        override val onSecondaryContainerDark = Color(0xFFFFDBCE)
        override val tertiaryDark = Color(0xFFD3C78E)
        override val onTertiaryDark = Color(0xFF383006)
        override val tertiaryContainerDark = Color(0xFF4F471B)
        override val onTertiaryContainerDark = Color(0xFFF0E3A8)
        override val errorDark = Color(0xFFFFB4AB)
        override val onErrorDark = Color(0xFF690005)
        override val errorContainerDark = Color(0xFF93000A)
        override val onErrorContainerDark = Color(0xFFFFDAD6)
        override val backgroundDark = Color(0xFF1A110E)
        override val onBackgroundDark = Color(0xFFF1DFD9)
        override val surfaceDark = Color(0xFF1A110E)
        override val onSurfaceDark = Color(0xFFF1DFD9)
        override val surfaceVariantDark = Color(0xFF53433E)
        override val onSurfaceVariantDark = Color(0xFFD8C2BA)
        override val outlineDark = Color(0xFFA08D86)
        override val outlineVariantDark = Color(0xFF53433E)
        override val scrimDark = Color(0xFF000000)
        override val inverseSurfaceDark = Color(0xFFF1DFD9)
        override val inverseOnSurfaceDark = Color(0xFF382E2A)
        override val inversePrimaryDark = Color(0xFF8E4D31)
        override val surfaceDimDark = Color(0xFF1A110E)
        override val surfaceBrightDark = Color(0xFF423733)
        override val surfaceContainerLowestDark = Color(0xFF140C09)
        override val surfaceContainerLowDark = Color(0xFF231A16)
        override val surfaceContainerDark = Color(0xFF271E1A)
        override val surfaceContainerHighDark = Color(0xFF322824)
        override val surfaceContainerHighestDark = Color(0xFF3D322F)
    }

    data object Default : MyColors() {

        override val primaryLight = Color(0xFF4C662B)
        override val onPrimaryLight = Color(0xFFFFFFFF)
        override val primaryContainerLight = Color(0xFFCDEDA3)
        override val onPrimaryContainerLight = Color(0xFF102000)
        override val secondaryLight = Color(0xFF586249)
        override val onSecondaryLight = Color(0xFFFFFFFF)
        override val secondaryContainerLight = Color(0xFFDBE7C8)
        override val onSecondaryContainerLight = Color(0xFF151E0B)
        override val tertiaryLight = Color(0xFF386663)
        override val onTertiaryLight = Color(0xFFFFFFFF)
        override val tertiaryContainerLight = Color(0xFFBCECE7)
        override val onTertiaryContainerLight = Color(0xFF00201E)
        override val errorLight = Color(0xFFBA1A1A)
        override val onErrorLight = Color(0xFFFFFFFF)
        override val errorContainerLight = Color(0xFFFFDAD6)
        override val onErrorContainerLight = Color(0xFF410002)
        override val backgroundLight = Color(0xFFF9FAEF)
        override val onBackgroundLight = Color(0xFF1A1C16)
        override val surfaceLight = Color(0xFFF9FAEF)
        override val onSurfaceLight = Color(0xFF1A1C16)
        override val surfaceVariantLight = Color(0xFFE1E4D5)
        override val onSurfaceVariantLight = Color(0xFF44483D)
        override val outlineLight = Color(0xFF75796C)
        override val outlineVariantLight = Color(0xFFC5C8BA)
        override val scrimLight = Color(0xFF000000)
        override val inverseSurfaceLight = Color(0xFF2F312A)
        override val inverseOnSurfaceLight = Color(0xFFF0F2E6)
        override val inversePrimaryLight = Color(0xFFB1D18A)
        override val surfaceDimLight = Color(0xFFDADBD0)
        override val surfaceBrightLight = Color(0xFFF9FAEF)
        override val surfaceContainerLowestLight = Color(0xFFFFFFFF)
        override val surfaceContainerLowLight = Color(0xFFF3F4E9)
        override val surfaceContainerLight = Color(0xFFEEEFE3)
        override val surfaceContainerHighLight = Color(0xFFE8E9DE)
        override val surfaceContainerHighestLight = Color(0xFFE2E3D8)

        override val primaryDark = Color(0xFFB1D18A)
        override val onPrimaryDark = Color(0xFF1F3701)
        override val primaryContainerDark = Color(0xFF354E16)
        override val onPrimaryContainerDark = Color(0xFFCDEDA3)
        override val secondaryDark = Color(0xFFBFCBAD)
        override val onSecondaryDark = Color(0xFF2A331E)
        override val secondaryContainerDark = Color(0xFF404A33)
        override val onSecondaryContainerDark = Color(0xFFDBE7C8)
        override val tertiaryDark = Color(0xFFA0D0CB)
        override val onTertiaryDark = Color(0xFF003735)
        override val tertiaryContainerDark = Color(0xFF1F4E4B)
        override val onTertiaryContainerDark = Color(0xFFBCECE7)
        override val errorDark = Color(0xFFFFB4AB)
        override val onErrorDark = Color(0xFF690005)
        override val errorContainerDark = Color(0xFF93000A)
        override val onErrorContainerDark = Color(0xFFFFDAD6)
        override val backgroundDark = Color(0xFF12140E)
        override val onBackgroundDark = Color(0xFFE2E3D8)
        override val surfaceDark = Color(0xFF12140E)
        override val onSurfaceDark = Color(0xFFE2E3D8)
        override val surfaceVariantDark = Color(0xFF44483D)
        override val onSurfaceVariantDark = Color(0xFFC5C8BA)
        override val outlineDark = Color(0xFF8F9285)
        override val outlineVariantDark = Color(0xFF44483D)
        override val scrimDark = Color(0xFF000000)
        override val inverseSurfaceDark = Color(0xFFE2E3D8)
        override val inverseOnSurfaceDark = Color(0xFF2F312A)
        override val inversePrimaryDark = Color(0xFF4C662B)
        override val surfaceDimDark = Color(0xFF12140E)
        override val surfaceBrightDark = Color(0xFF383A32)
        override val surfaceContainerLowestDark = Color(0xFF0C0F09)
        override val surfaceContainerLowDark = Color(0xFF1A1C16)
        override val surfaceContainerDark = Color(0xFF1E201A)
        override val surfaceContainerHighDark = Color(0xFF282B24)
        override val surfaceContainerHighestDark = Color(0xFF33362E)
    }
}
