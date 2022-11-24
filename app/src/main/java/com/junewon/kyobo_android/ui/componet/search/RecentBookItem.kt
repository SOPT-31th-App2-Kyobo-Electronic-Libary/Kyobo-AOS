package com.junewon.kyobo_android.ui.componet.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.data.entity.RecentBook
import com.junewon.kyobo_android.ui.theme.KyoboTheme

@Composable
fun RecentBookItem(
    book: RecentBook = RecentBook()
) {
    Surface(modifier = Modifier.width(width = 86.dp)) {
        Column() {
            AsyncImage(
                model = book.image,
                placeholder = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Recent Book",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = book.publisher,
                style = KyoboTheme.typography.b3,
                color = colorResource(id = R.color.kyobo_green)
            )
            Spacer(modifier = Modifier.height(1.dp))
            Text(text = book.title, style = KyoboTheme.typography.b1)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = book.author,
                style = KyoboTheme.typography.b4,
                color = colorResource(id = R.color.kyobo_gray)
            )
        }
    }
}

@Preview("Book")
@Composable
fun RecentBookItemPreview() {
    KyoboTheme {
        RecentBookItem()
    }
}
