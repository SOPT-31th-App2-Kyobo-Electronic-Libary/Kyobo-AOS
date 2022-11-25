package com.junewon.kyobo_android.presentation.detail

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.junewon.kyobo_android.data.entity.Book
import com.junewon.kyobo_android.data.service.ServicePool
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {
    private val detailService = ServicePool.detailService

    private var _uiState = MutableStateFlow(Book())
    val uiState = _uiState.asStateFlow()

    fun fetchBookDetail(bookId: Int) {
        viewModelScope.launch {
            runCatching { detailService.fetchBookDetail(bookId = bookId) }
                .onSuccess { response ->
                    _uiState.update {
                        response.data.book
                    }
                }.onFailure {
                    Log.d("Error", "DetailViewModel - fetchBookDetail", it)
                }
        }
    }
}
