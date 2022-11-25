package com.junewon.kyobo_android.presentation.detail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.R.color
import com.junewon.kyobo_android.ui.componet.detail.DetailBookImage
import com.junewon.kyobo_android.ui.componet.detail.TakeOutBookCard
import com.junewon.kyobo_android.ui.theme.KyoboTheme

@Composable
fun DetailScreen(
    detailViewModel: DetailViewModel,
    finish: () -> Unit
) {
    val uiState by detailViewModel.uiState.collectAsState()
    val scrollState = rememberScrollState()
    Surface(
        Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Column {
            Spacer(modifier = Modifier.height(18.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "back button",
                Modifier
                    .padding(start = 25.dp)
                    .clickable { finish() }
            )
            DetailBookImage(imageUrl = uiState.image)
            Spacer(modifier = Modifier.height(18.dp))
            Column(Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "홍익대학교",
                    color = colorResource(id = R.color.kyobo_green),
                    style = KyoboTheme.typography.b2.copy(
                        fontWeight = FontWeight.W700
                    )
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = uiState.name, style = KyoboTheme.typography.h1)
                Spacer(modifier = Modifier.height(6.dp))
                AuthorWithPublisherText(author = uiState.author, publisher = uiState.publisher)
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = uiState.pubDate)
                Spacer(modifier = Modifier.height(14.dp))
                PdfFileCard()
                Spacer(modifier = Modifier.height(29.dp))
                DetailBookMenu()
                Spacer(modifier = Modifier.height(6.dp))
                Spacer(
                    modifier = Modifier
                        .size(width = 50.dp, height = 2.dp)
                        .background(colorResource(id = R.color.kyobo_black))
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = uiState.description,
                    style = KyoboTheme.typography.b2,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp)
                )
                Spacer(modifier = Modifier.height(90.dp))
            }
        }
    }
    Row(
        modifier = Modifier
            .fillMaxSize(),
        verticalAlignment = Alignment.Bottom
    ) {
        TakeOutBookCard(
            returnDate = uiState.returnDate
        )
    }
}

@Composable
private fun AuthorWithPublisherText(
    author: String,
    publisher: String
) {
    val divider = " | "
    val text = buildAnnotatedString {
        append(author)
        append(divider)
        append(publisher)
    }
    Text(text = text, style = KyoboTheme.typography.b1)
}

@Composable
private fun PdfFileCard() {
    Row(
        Modifier.fillMaxWidth()
    ) {
        Surface(
            border = BorderStroke(1.dp, colorResource(id = R.color.kyobo_gray)),
            shape = RoundedCornerShape(21.dp)
        ) {
            Text(
                text = "pdf 파일",
                color = colorResource(id = color.kyobo_gray),
                style = KyoboTheme.typography.b3,
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp, bottom = 4.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "20MB",
            color = colorResource(id = color.kyobo_gray),
            style = KyoboTheme.typography.b3
        )
    }
}

@Composable
fun DetailBookMenu() {
    Row(Modifier.fillMaxWidth()) {
        listOf("책 소개", "저자소개", "목차", "리뷰").forEachIndexed { idx, text ->
            if (idx == 0) {
                Text(
                    text = text,
                    style = KyoboTheme.typography.h2,
                    color = colorResource(id = R.color.kyobo_black)
                )
                return@forEachIndexed
            }
            Spacer(modifier = Modifier.width(23.dp))
            Text(
                text = text,
                style = KyoboTheme.typography.s1
            )
        }
    }
}
