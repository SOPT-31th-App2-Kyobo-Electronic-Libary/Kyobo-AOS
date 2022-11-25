package com.junewon.kyobo_android.presentation.home

import androidx.lifecycle.ViewModel
import com.junewon.kyobo_android.data.model.response.HomeResponse

class HomeViewModel : ViewModel() {
    //val borrowedList = mutableListOf<HomeResponse.Books.LendingBook>()
    //val bestList = mutableListOf<HomeResponse.Books.BestBook>()
    //val newList = mutableListOf<HomeResponse.Books.NewBook>()
    //val categoryList = mutableListOf<HomeResponse.Books.CategoryBook>()
    val borrowedList = listOf(
        HomeResponse.Books.LendingBook(
            id = 1,
            name = "심층강화",
            image = "https://blog.kakaocdn.net/dn/dUCwpv/btrtb1YDnau/sjvLGYK99buo1vgbNnnKF1/img.png",
            lendingDate = "2022-11-30",
            returnDate = "2022-12-02",
            dDay = 7
        ),
        HomeResponse.Books.LendingBook(
            id = 2,
            name = "심층ddff강화",
            image = "https://blog.kakaocdn.net/dn/dUCwpv/btrtb1YDnau/sjvLGYK99buo1vgbNnnKF1/img.png",
            lendingDate = "2022-11-30",
            returnDate = "2022-12-02",
            dDay = 7
        ),
        HomeResponse.Books.LendingBook(
            id = 3,
            name = "심층dd강화",
            image = "https://blog.kakaocdn.net/dn/dUCwpv/btrtb1YDnau/sjvLGYK99buo1vgbNnnKF1/img.png",
            lendingDate = "2022-11-30",
            returnDate = "2022-12-02",
            dDay = 7
        )
    )

    val bestList = listOf(
        HomeResponse.Books.BestBook(
            id = 9,
            name = "오직 네 사람",
            image = "http://image.yes24.com/goods/104643906/XL",
            author = "이수민",
            description = "이 책은 심층강화학습의 전체 과정을 소개한다"
        ),
        HomeResponse.Books.BestBook(
            id = 10,
            name = "오직 한 사람",
            image = "http://image.yes24.com/goods/104643906/XL",
            author = "김수민",
            description = "이 책ㄹㄹㄹㄹ은 심층강화학습의 전체 과정을 소개한다"
        ),
        HomeResponse.Books.BestBook(
            id = 11,
            name = "오직 두 사람",
            image = "http://image.yes24.com/goods/104643906/XL",
            author = "배수민",
            description = "이 책은ㄴㄴㄴㄴ 심층강화학습의 전체 과정을 소개한다"
        ),
    )

    val newList = listOf(
        HomeResponse.Books.NewBook(
            id = 6,
            name = "트랜드 코리아\n",
            image = "https://bimage.interpark.com/partner/goods_image/0/3/6/1/355430361g.jpg",
            author = "김난도\n"
        ),
        HomeResponse.Books.NewBook(
            id = 7,
            name = "트랜드 1 코리아\n",
            image = "https://bimage.interpark.com/partner/goods_image/0/3/6/1/355430361g.jpg",
            author = "이난도\n"
        ),
        HomeResponse.Books.NewBook(
            id = 8,
            name = "트랜드 2 코리아\n",
            image = "https://bimage.interpark.com/partner/goods_image/0/3/6/1/355430361g.jpg",
            author = "박난도\n"
        ),
    )

    val categoryList = listOf(
        HomeResponse.Books.CategoryBook(
            id = 3,
            name = "책",
            image = "https://bimage.interpark.com/partner/goods_image/8/2/2/6/206608226g.jpg",
            author = "한수정",
            category = "경영"
        ),
        HomeResponse.Books.CategoryBook(
            id = 14,
            name = "또 다른 책",
            image = "https://bimage.interpark.com/partner/goods_image/8/2/2/6/206608226g.jpg",
            author = "두수정",
            category = "경영"
        ),
        HomeResponse.Books.CategoryBook(
            id = 11,
            name = "세번째 책",
            image = "https://bimage.interpark.com/partner/goods_image/8/2/2/6/206608226g.jpg",
            author = "세수정",
            category = "경영"
        ),
    )
}
