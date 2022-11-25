package com.junewon.kyobo_android.presentation.detail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.junewon.kyobo_android.ui.theme.KyoboTheme

class DetailActivity : ComponentActivity() {
    private val viewModel by viewModels<DetailViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KyoboTheme{
                DetailScreen(
                    detailViewModel = viewModel,
                    finish = ::finish
                )
            }
        }
        fetchBookDetail()
    }
    private fun fetchBookDetail() {
        viewModel.fetchBookDetail(intent.getIntExtra("id", 6))
    }
}
