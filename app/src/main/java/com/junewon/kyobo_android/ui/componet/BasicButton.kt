package com.junewon.kyobo_android.ui.componet

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.ui.theme.KyoboTheme


/**
 * 버튼 자체 패딩 없고, textStyle, color값 조절하기 편한 Basic Button*/
@Composable
fun BasicButton(
    onClick: () -> Unit = {},
    enabled: Boolean = true, // 활설화 비활성화
    backGroundColor: Color = colorResource(id = R.color.kyobo_green), // 활성화 됐을 때 BackGroundColor
    contentColor: Color = colorResource(id = R.color.kyobo_white), // 활성화 됐을 때 contentColor
    disabledBackgroundColor: Color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f) // 비활성화 됐을 때 BackGroundColor
        .compositeOver(MaterialTheme.colors.surface),
    disabledContentColor: Color = MaterialTheme.colors.onSurface // 비활성화 됐을 때 contentColor
        .copy(alpha = ContentAlpha.disabled),
    textStyle: TextStyle = KyoboTheme.typography.h2,
    contentPadding: PaddingValues = PaddingValues(), // Content 자체 패딩 없애기
    modifier: Modifier = Modifier.defaultMinSize(1.dp, 1.dp),
    content: @Composable RowScope.() -> Unit = {}
) {
    Button(
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor =
            backGroundColor,
            contentColor = contentColor,
            disabledBackgroundColor = disabledBackgroundColor,
            disabledContentColor = disabledContentColor
        ),
        contentPadding = contentPadding,
        onClick = onClick,
        modifier = modifier
    ) {
        ProvideTextStyle(value = textStyle) { // set our own text style
            content()
        }
    }
}
