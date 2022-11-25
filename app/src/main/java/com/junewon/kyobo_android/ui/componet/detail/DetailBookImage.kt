package com.junewon.kyobo_android.ui.componet.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.ui.theme.KyoboTheme

@Composable
fun DetailBookImage(imageUrl: String) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(300.dp), contentAlignment = Alignment.Center) {
        AsyncImage(
            model = imageUrl,
            contentDescription = "book background",
            modifier = Modifier
                .fillMaxWidth()
                .blur(radius = 20.dp),
            contentScale = ContentScale.Crop,
            placeholder = painterResource(id = R.drawable.ic_bottom_home_selected)
        )
        AsyncImage(
            model = imageUrl,
            contentDescription = "book image",
            modifier = Modifier
                .fillMaxWidth(0.41f)
                .fillMaxHeight(0.66f),
            placeholder = painterResource(id = R.drawable.ic_bottom_home_selected)
        )
    }
}

@Preview
@Composable
fun DetailBookImagePreview() {
    KyoboTheme {
        Column(Modifier.fillMaxSize()) {
            DetailBookImage("http://image.yes24.com/goods/104643906/XL")
        }
    }
}
