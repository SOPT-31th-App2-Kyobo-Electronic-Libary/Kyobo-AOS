package com.junewon.kyobo_android.ui.componet.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.ui.theme.KyoboTheme

@Composable
fun SearchAppBar() {
    var searchName by remember { mutableStateOf("") }
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 25.dp, end = 21.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = "back button")
        SearchTextField(hint = "검색어를 입력해주세요", text = searchName, onTextChange = { searchName = it })
        Image(painter = painterResource(id = R.drawable.ic_search), contentDescription = "")
    }
}

@Preview
@Composable
fun SearchAppBarPreview() {
    KyoboTheme {
        SearchAppBar()
    }
}
