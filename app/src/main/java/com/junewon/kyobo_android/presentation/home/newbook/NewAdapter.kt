package com.junewon.kyobo_android.presentation.home.newbook

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.junewon.kyobo_android.data.model.response.HomeResponse
import com.junewon.kyobo_android.databinding.ItemHomeNewBinding

class NewAdapter(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val inflater by lazy { LayoutInflater.from(context) }
    private var newList: List<HomeResponse.Books.NewBook> = emptyList()

    class NewViewHolder(
        private val binding: ItemHomeNewBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(book: HomeResponse.Books.NewBook) {
            binding.tvHomeNew.text = book.name
            binding.ivHomeNew.load(book.image)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewList(list: List<HomeResponse.Books.NewBook>) {
        this.newList = list.toList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemHomeNewBinding.inflate(inflater, parent, false)
        return NewViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is NewViewHolder) holder.onBind(newList[position])
    }

    override fun getItemCount() = newList.size
}
