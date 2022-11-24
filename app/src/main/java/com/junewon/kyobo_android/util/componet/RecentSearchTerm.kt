package com.junewon.kyobo_android.util.componet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.util.theme.KyoboTheme

@Composable
fun RecentSearchTerm(term: String = "오직 두 사람") {
    Surface(
        modifier = Modifier
            .wrapContentSize(),
        color = colorResource(id = R.color.kyobo_light_gray),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(10.dp),
                painter = painterResource(id = R.drawable.ic_search_delete),
                contentDescription = "delete search Term",
                colorFilter = ColorFilter.tint(color = colorResource(id = R.color.kyobo_dark_gray))
            )
            Spacer(modifier = Modifier.width(9.dp))
            Text(text = term, style = KyoboTheme.typography.b2, color = colorResource(id = R.color.kyobo_dark_gray))
        }
    }
}

@Preview("RecentSearchTerm")
@Composable
fun RecentSearchTermPreview() {
    KyoboTheme {
        RecentSearchTerm()
    }
}
