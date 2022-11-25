package com.junewon.kyobo_android.presentation.search

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.junewon.kyobo_android.data.entity.RecentBook
import com.junewon.kyobo_android.ui.theme.KyoboTheme

class SearchActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KyoboTheme {
                SearchScreen(dummyBooks)
            }
        }
    }

    companion object {
        val dummyBooks = listOf(
            RecentBook(id = 1),
            RecentBook(
                id = 2,
                title = "책",
                image = "https://bimage.interpark.com/partner/goods_image/8/2/2/6/206608226g.jpg",
                author = "한수정",
                publisher = "한빛미디어"
            ),
            RecentBook(
                id = 3,
                title = "오직 두사람",
                image = "http://image.yes24.com/goods/104643906/XL",
                author = "이정민",
                publisher = "한빛미디어"
            ),
            RecentBook(
                id = 4,
                title = "책",
                image = "https://bimage.interpark.com/partner/goods_image/8/2/2/6/206608226g.jpg",
                author = "한수정",
                publisher = "웅진주니어"
            ),
            RecentBook(
                id = 5,
                title = "단단한 심층강화학습",
                image = "https://blog.kakaocdn.net/dn/dUCwpv/btrtb1YDnau/sjvLGYK99buo1vgbNnnKF1/img.png",
                author = "멀티코어",
                publisher = "중앙출판사"
            ),
            RecentBook(
                id = 6,
                title = "오직 한 사람",
                image = "http://image.yes24.com/goods/104643906/XL",
                author = "장범근",
                publisher = "초록세상"
            )
        )
    }
}
