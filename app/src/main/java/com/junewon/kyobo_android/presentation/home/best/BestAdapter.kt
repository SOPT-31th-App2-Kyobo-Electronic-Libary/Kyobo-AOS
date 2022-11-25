package com.junewon.kyobo_android.presentation.home.best

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.junewon.kyobo_android.data.model.response.HomeResponse
import com.junewon.kyobo_android.databinding.ItemHomeBestBinding

class BestAdapter(
    private val navigateDetailWith: (Int) -> Unit = {},
    context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val inflater by lazy { LayoutInflater.from(context) }
    private var bestList: List<HomeResponse.Books.BestBook> = emptyList()

    class BestViewHolder(
        private val navigateDetailWith: (Int) -> Unit = {},
        private val binding: ItemHomeBestBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(book: HomeResponse.Books.BestBook) {
            binding.tvHomeBestBook.text = book.name
            binding.tvHomeBestAuthor.text = book.author
            binding.tvHomeBestDetail.text = book.description
            binding.ivHomeBest.run {
                load(book.image)
                setOnClickListener {
                    navigateDetailWith(book.id)
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setBestList(list: List<HomeResponse.Books.BestBook>) {
        this.bestList = list.toList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemHomeBestBinding.inflate(inflater, parent, false)
        return BestViewHolder(navigateDetailWith, binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is BestViewHolder) holder.onBind(bestList[position])
    }

    override fun getItemCount() = bestList.size
}
