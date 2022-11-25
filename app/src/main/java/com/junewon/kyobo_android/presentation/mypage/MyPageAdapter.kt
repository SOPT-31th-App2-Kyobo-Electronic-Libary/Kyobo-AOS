package com.junewon.kyobo_android.presentation.mypage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.junewon.kyobo_android.data.model.response.MyPageResponse
import com.junewon.kyobo_android.databinding.ItemMyPageBorrowedBinding

class MyPageAdapter(
    private val navigateDetailWith: (Int) -> Unit = {},
    private val borrowedList : List<MyPageResponse.Data.Book>
) : RecyclerView.Adapter<MyPageAdapter.MyViewHolder>() {

    inner class MyViewHolder(
        private val binding: ItemMyPageBorrowedBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: MyPageResponse.Data.Book) {
            binding.ivHomeBorrowed.load(data.image)
            binding.ivHomeBorrowed.setOnClickListener {
                navigateDetailWith(data.id)
            }
            binding.tvMyPageBookTitle.text = data.name
            binding.tvMyPageBorrowDate.text = data.lendingDate
            binding.tvMyPageReturnDate.text = data.returnDate
            if (data.dDay == 0) binding.tvMyPageDday.text = "반납일"
            else binding.tvMyPageDday.text = "D-" + data.dDay
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPageAdapter.MyViewHolder {
        val binding: ItemMyPageBorrowedBinding =
            ItemMyPageBorrowedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            holder.onBind(borrowedList[position])
        }
    }

    override fun getItemCount(): Int {
        return borrowedList.size
    }
}
