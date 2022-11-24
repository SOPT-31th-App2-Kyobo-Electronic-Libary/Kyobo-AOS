package com.junewon.kyobo_android.presentation.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.data.entity.RecentBook
import com.junewon.kyobo_android.util.componet.RecentBooks
import com.junewon.kyobo_android.util.componet.RecentSearchTerm
import com.junewon.kyobo_android.util.componet.SearchAppBar
import com.junewon.kyobo_android.util.theme.KyoboTheme

@Composable
fun SearchScreen(books: List<RecentBook>) {
    Column(Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(11.dp))
        SearchAppBar()
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 18.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "최근검색어", style = KyoboTheme.typography.b2)
            Text(text = "전체삭제", style = KyoboTheme.typography.b4, color = colorResource(id = R.color.kyobo_gray))
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
        ) {
            RecentSearchTerm()
            Spacer(modifier = Modifier.width(12.dp))
            RecentSearchTerm(term = "데미안")
        }
        Spacer(modifier = Modifier.height(15.dp))
        RecentSearchTerm(modifier = Modifier.padding(start = 16.dp), term = "지적대화를 위한 넓고 얕은 지식")
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "최근 본 도서",
            style = KyoboTheme.typography.b2.copy(),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(15.dp))
        RecentBooks(recentBooks = books)
    }
}

@Preview("SearchScreen")
@Composable
fun SearchScreenPreview() {
    KyoboTheme {
        SearchScreen(SearchActivity.dummyBooks)
    }
}
