package com.junewon.kyobo_android.util.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.util.theme.KyoboTheme

@Composable
fun SearchTextField(
    text: String = "",
    hint: String,
    isSingleLine: Boolean = true,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextChange: (String) -> Unit
) {
    BasicTextField(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .clip(RoundedCornerShape(8.dp))
            .background(colorResource(id = R.color.kyobo_light_gray))
            .padding(horizontal = 12.dp, vertical = 6.dp),
        value = text,
        singleLine = isSingleLine,
        maxLines = 1,
        onValueChange = onTextChange,
        textStyle = KyoboTheme.typography.b2,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        cursorBrush = SolidColor(Color.Black)
    ) { innerTextField ->
        if (text.isEmpty()) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = hint,
                color = colorResource(id = R.color.kyobo_gray),
                style = KyoboTheme.typography.b2
            )
        }
        innerTextField()
    }
}

@Preview
@Composable
fun SearchTextFieldPreview() {
    KyoboTheme {
        var text by remember { mutableStateOf("") }
        SearchTextField(text, "힌트힌트", onTextChange = { text = it })
    }
}
