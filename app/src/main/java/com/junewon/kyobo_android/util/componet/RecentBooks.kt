package com.junewon.kyobo_android.util.componet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.data.entity.RecentBook
import com.junewon.kyobo_android.util.theme.KyoboTheme

@Composable
fun RecentBooks(recentBooks: List<RecentBook> = emptyList()) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        items(recentBooks, key = { it.id }) { book ->
            RecentBookItem(book = book)
        }
    }
}

@Preview("RecentBooks")
@Composable
fun RecentBooksPreview() {
    KyoboTheme {
        RecentBooks(
            listOf(
                RecentBook(1),
                RecentBook(2),
                RecentBook(3),
                RecentBook(4),
                RecentBook(5)
            )
        )
    }
}
