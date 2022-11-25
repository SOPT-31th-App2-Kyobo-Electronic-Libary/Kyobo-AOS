package com.junewon.kyobo_android.presentation.home.catagory

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.junewon.kyobo_android.data.model.response.HomeResponse
import com.junewon.kyobo_android.databinding.ItemHomeCatagoryBinding

class CategoryAdapter(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val inflater by lazy { LayoutInflater.from(context) }
    private var categoryList: List<HomeResponse.Books.CategoryBook> = emptyList()

    class CategoryViewHolder(
        private val binding: ItemHomeCatagoryBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(book: HomeResponse.Books.CategoryBook) {
            binding.tvHomeCatagory.text = book.name
            binding.ivHomeCatagory.load(book.image)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setCategoryList(list: List<HomeResponse.Books.CategoryBook>) {
        this.categoryList = list.toList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemHomeCatagoryBinding.inflate(inflater, parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CategoryViewHolder) holder.onBind(categoryList[position])
    }

    override fun getItemCount() = categoryList.size
}
