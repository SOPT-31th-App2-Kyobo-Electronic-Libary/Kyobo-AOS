package com.junewon.kyobo_android.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.junewon.kyobo_android.data.model.response.HomeResponse
import com.junewon.kyobo_android.data.service.ServicePool
import com.junewon.kyobo_android.databinding.FragmentHomeBinding
import com.junewon.kyobo_android.presentation.home.best.BestAdapter
import com.junewon.kyobo_android.presentation.home.borrow.BorrowedAdapter
import com.junewon.kyobo_android.presentation.home.catagory.CategoryAdapter
import com.junewon.kyobo_android.presentation.home.newbook.NewAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {
    private val viewModel by viewModels<HomeViewModel>()
    private val homeService = ServicePool.homeService

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = requireNotNull(_binding) { "value of HomeFragment _binding is null" }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val borrowed = BorrowedAdapter(requireContext())
        binding.rvHomeBorrowed.adapter = borrowed
        borrowed.setBorrowedList(viewModel.borrowedList)

        val best = BestAdapter(requireContext())
        binding.rvHomeBest.adapter = best
        best.setBestList(viewModel.bestList)

        val newbook = NewAdapter(requireContext())
        binding.rvHomeNew.adapter = newbook
        newbook.setNewList(viewModel.newList)

        val category = CategoryAdapter(requireContext())
        binding.rvHomeCategory.adapter = category
        category.setCategoryList(viewModel.categoryList)


//        homeService.getBook()
//            .enqueue(object : Callback<HomeResponse> {
//                override fun onResponse(call: Call<HomeResponse>, response: Response<HomeResponse>) {
//                    if (response.isSuccessful) {
//                        response.body()?.books?.let { viewModel.borrowedList.addAll(it.lendingBook) }
//                        response.body()?.books?.let { viewModel.bestList.addAll(it.bestBook) }
//                        response.body()?.books?.let { viewModel.newList.addAll(it.newBook) }
//                        response.body()?.books?.let { viewModel.categoryList.addAll(it.categoryBook) }
//
//                        val borrowed = BorrowedAdapter(requireContext())
//                        binding.rvHomeBorrowed.adapter = borrowed
//                        borrowed.setBorrowedList(viewModel.borrowedList)
//
//                        val best = BestAdapter(requireContext())
//                        binding.rvHomeBest.adapter = best
//                        best.setBestList(viewModel.bestList)
//
//                        val newbook = NewAdapter(requireContext())
//                        binding.rvHomeNew.adapter = newbook
//                        newbook.setNewList(viewModel.newList)
//
//                        val category = CategoryAdapter(requireContext())
//                        binding.rvHomeCategory.adapter = category
//                        category.setCategoryList(viewModel.categoryList)
//
//                    } else {
//                        Snackbar.make(binding.root, "데이터를 불러오는데 실패했습니다", Snackbar.LENGTH_SHORT).show()
//                    }
//                }
//
//                override fun onFailure(call: Call<HomeResponse>, t: Throwable) {
//                    Snackbar.make(binding.root, "네트워크에 문제가 생겼습니다", Snackbar.LENGTH_SHORT).show()
//                }
//
//            })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
