package com.junewon.kyobo_android.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalKyoboTypography = staticCompositionLocalOf<KyoboTypography> {
    error("No HousTypography provided")
}

object KyoboTheme {
    val typography: KyoboTypography @Composable get() = LocalKyoboTypography.current
}

@Composable
fun ProvideKyoboTypography(
    typography: KyoboTypography,
    content: @Composable () -> Unit
) {
    val provideTypography = remember { typography.copy() }
    CompositionLocalProvider(
        LocalKyoboTypography provides provideTypography,
        content = content
    )
}

@Composable
fun KyoboTheme(
    content: @Composable () -> Unit
) {
    val typography = KyoboTypography()
    ProvideKyoboTypography(typography = typography) {
        MaterialTheme(content = content)
    }
}
