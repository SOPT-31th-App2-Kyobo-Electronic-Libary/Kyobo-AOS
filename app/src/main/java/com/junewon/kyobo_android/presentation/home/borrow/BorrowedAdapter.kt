package com.junewon.kyobo_android.presentation.home.borrow

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.junewon.kyobo_android.data.model.response.HomeResponse
import com.junewon.kyobo_android.databinding.ItemHomeBorrowedBinding

class BorrowedAdapter(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val inflater by lazy { LayoutInflater.from(context) }
    private var borrowedList: List<HomeResponse.Books.LendingBook> = emptyList()

    class BorrowedViewHolder(
        private val binding: ItemHomeBorrowedBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(book: HomeResponse.Books.LendingBook) {
            binding.tvHomeBorrowed.text = book.name
            when (book.dDay) {
                0 -> binding.tvHomeBorrowedDays.append("DAY")
                else -> binding.tvHomeBorrowedDays.append(book.dDay.toString())
            }
            binding.ivHomeBorrowed.load(book.image)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setBorrowedList(list: List<HomeResponse.Books.LendingBook>) {
        this.borrowedList = list.toList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemHomeBorrowedBinding.inflate(inflater, parent, false)
        return BorrowedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is BorrowedViewHolder) holder.onBind(borrowedList[position])
    }

    override fun getItemCount() = borrowedList.size
}
