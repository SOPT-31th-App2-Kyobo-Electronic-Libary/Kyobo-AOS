package com.junewon.kyobo_android.util.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.util.componet.dpToSp

private val notoSansKr = FontFamily(
    Font(
        R.font.noto_sans_kr_bold,
        FontWeight.W700,
        FontStyle.Normal
    ),
    Font(
        R.font.noto_sans_kr_regular,
        FontWeight.W400,
        FontStyle.Normal
    )
)

private val notoSansKrMedium = FontFamily(
    Font(
        R.font.noto_sans_kr_medium_f,
        FontWeight.W500,
        FontStyle.Normal
    )
)

@Stable
class KyoboTypography internal constructor(
    h1: TextStyle,
    h2: TextStyle,
    h3: TextStyle,
    s1: TextStyle,
    s2: TextStyle,
    b1: TextStyle,
    b2: TextStyle,
    b3: TextStyle,
    b4: TextStyle
) {
    var h1: TextStyle by mutableStateOf(h1)
        private set
    var h2: TextStyle by mutableStateOf(h2)
        private set
    var h3: TextStyle by mutableStateOf(h3)
        private set
    var s1: TextStyle by mutableStateOf(s1)
        private set
    var s2: TextStyle by mutableStateOf(s2)
        private set
    var b1: TextStyle by mutableStateOf(b1)
        private set
    var b2: TextStyle by mutableStateOf(b2)
        private set
    var b3: TextStyle by mutableStateOf(b3)
        private set
    var b4: TextStyle by mutableStateOf(b4)
        private set

    fun copy(
        h1: TextStyle = this.h1,
        h2: TextStyle = this.h2,
        h3: TextStyle = this.h3,
        s1: TextStyle = this.s1,
        s2: TextStyle = this.s2,
        b1: TextStyle = this.b1,
        b2: TextStyle = this.b2,
        b3: TextStyle = this.b3,
        b4: TextStyle = this.b4
    ): KyoboTypography = KyoboTypography(h1, h2, h3, s1, s2, b1, b2, b3, b4)
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun KyoboTypography(): KyoboTypography {
    return KyoboTypography(
        h1 = TextStyle(
            fontFamily = notoSansKr,
            fontWeight = FontWeight.Bold,
            fontSize = dpToSp(dp = 20.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        h2 = TextStyle(
            fontFamily = notoSansKr,
            fontWeight = FontWeight.Bold,
            fontSize = dpToSp(16.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        h3 = TextStyle(
            fontFamily = notoSansKrMedium,
            fontWeight = FontWeight.Normal,
            fontSize = dpToSp(16.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        s1 = TextStyle(
            fontFamily = notoSansKr,
            fontWeight = FontWeight.Normal,
            fontSize = dpToSp(16.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        s2 = TextStyle(
            fontFamily = notoSansKrMedium,
            fontWeight = FontWeight.Normal,
            fontSize = dpToSp(14.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        b1 = TextStyle(
            fontFamily = notoSansKrMedium,
            fontWeight = FontWeight.Normal,
            fontSize = dpToSp(14.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        b2 = TextStyle(
            fontFamily = notoSansKr,
            fontWeight = FontWeight.Normal,
            fontSize = dpToSp(14.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        b3 = TextStyle(
            fontFamily = notoSansKrMedium,
            fontWeight = FontWeight.Normal,
            fontSize = dpToSp(12.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        ),
        b4 = TextStyle(
            fontFamily = notoSansKr,
            fontWeight = FontWeight.Normal,
            fontSize = dpToSp(12.dp),
            letterSpacing = (-0.01).sp,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            )
        )
    )
}
