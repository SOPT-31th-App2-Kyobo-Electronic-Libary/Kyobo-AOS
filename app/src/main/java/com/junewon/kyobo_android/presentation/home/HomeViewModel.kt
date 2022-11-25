package com.junewon.kyobo_android.presentation.home

import androidx.lifecycle.ViewModel
import com.junewon.kyobo_android.data.model.response.HomeResponse

class HomeViewModel : ViewModel() {
    val borrowedList = mutableListOf<HomeResponse.Books.LendingBook>()
    val bestList = mutableListOf<HomeResponse.Books.BestBook>()
    val newList = mutableListOf<HomeResponse.Books.NewBook>()
    val categoryList = mutableListOf<HomeResponse.Books.CategoryBook>()
}
