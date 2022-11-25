package com.junewon.kyobo_android.ui.componet.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R.drawable
import com.junewon.kyobo_android.ui.componet.KyoboButton
import com.junewon.kyobo_android.ui.theme.KyoboTheme

@Composable
fun TakeOutBookCard(returnDate: String) {
    // 나중에 위쪽에 그림자 넣어줘여함
    Surface() {
        Row(
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
        ) {
            Image(
                painter = painterResource(id = drawable.ic_start_filled),
                contentDescription = "",
                Modifier
                    .padding(top = 26.dp, bottom = 27.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                Modifier
                    .wrapContentHeight()
                    .padding(top = 16.dp, bottom = 19.dp)
            ) {
                Text(text = returnDate, style = KyoboTheme.typography.h2)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "반납예정", style = KyoboTheme.typography.b2)
            }
            Spacer(modifier = Modifier.width(32.dp))
            KyoboButton(
                modifier = Modifier.padding(top = 17.dp, bottom = 19.dp),
                contentPadding = PaddingValues(vertical = 10.dp, horizontal = 47.dp)
            )
        }
    }
}

@Preview
@Composable
fun TakeOutBookCardPreView() {
    KyoboTheme {
        Surface() {
            TakeOutBookCard(returnDate = "2022. 10. 08")
        }
    }
}
