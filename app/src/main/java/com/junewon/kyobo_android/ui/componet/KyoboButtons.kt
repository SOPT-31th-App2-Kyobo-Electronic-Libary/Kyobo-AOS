package com.junewon.kyobo_android.ui.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.R.*
import com.junewon.kyobo_android.ui.theme.KyoboTheme


@Composable
fun KyoboButton(
    onClick: () -> Unit = {},
    text: String = stringResource(id = R.string.take_out_book),
    textStyle: TextStyle = KyoboTheme.typography.h2,
    contentPadding: PaddingValues = PaddingValues()
) {
    BasicButton(
        onClick = onClick,
        textStyle = textStyle,
        contentPadding = contentPadding
    ) {
        Text(
            text = text,
        )
    }
}

@Composable
fun KyoboOutLineButton(
    onClick: () -> Unit = {},
    text: String = stringResource(id = R.string.take_out_book),
    textStyle: TextStyle = KyoboTheme.typography.h2,
    contentPadding: PaddingValues = PaddingValues()
) {
    BasicButton(
        onClick = onClick,
        textStyle = textStyle,
        contentPadding = contentPadding,
        backGroundColor = colorResource(id = color.kyobo_white),
        contentColor = colorResource(color.kyobo_green),
        modifier = Modifier
            .background(color = colorResource(id = color.kyobo_white))
            .clip(RoundedCornerShape(4.dp))
            .border(
                width = 1.dp,
                color = colorResource(id = color.kyobo_green),
                RoundedCornerShape(4.dp)
            )
    ) {
        Text(
            text = text,
        )
    }
}

@OptIn(ExperimentalTextApi::class)
@Preview("DUMMY BUTTON")
@Composable
fun KyoboBasicButtonPreView() {
    KyoboTheme {
        Column(modifier = Modifier.wrapContentSize()) {
            KyoboButton(contentPadding = PaddingValues(vertical = 10.dp, horizontal = 57.dp))
            Spacer(modifier = Modifier.height(20.dp))
            KyoboOutLineButton(contentPadding = PaddingValues(vertical = 10.dp, horizontal = 57.dp))
        }
    }
}
