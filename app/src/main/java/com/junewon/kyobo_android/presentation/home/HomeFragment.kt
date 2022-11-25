package com.junewon.kyobo_android.presentation.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.junewon.kyobo_android.data.model.response.HomeResponse
import com.junewon.kyobo_android.data.service.ServicePool
import com.junewon.kyobo_android.databinding.FragmentHomeBinding
import com.junewon.kyobo_android.presentation.detail.DetailActivity
import com.junewon.kyobo_android.presentation.home.best.BestAdapter
import com.junewon.kyobo_android.presentation.home.borrow.BorrowedAdapter
import com.junewon.kyobo_android.presentation.home.catagory.CategoryAdapter
import com.junewon.kyobo_android.presentation.home.newbook.NewAdapter
import com.junewon.kyobo_android.presentation.search.SearchActivity
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

        homeService.getBook()
            .enqueue(object : Callback<HomeResponse> {
                override fun onResponse(call: Call<HomeResponse>, response: Response<HomeResponse>) {
                    if (response.isSuccessful) {
                        response.body()?.books?.let { viewModel.borrowedList.addAll(it.lendingBook) }
                        response.body()?.books?.let { viewModel.bestList.addAll(it.bestBook) }
                        response.body()?.books?.let { viewModel.newList.addAll(it.newBook) }
                        response.body()?.books?.let { viewModel.categoryList.addAll(it.categoryBook) }

                        val borrowed = BorrowedAdapter(::navigateDetailWith, requireContext())
                        binding.rvHomeBorrowed.adapter = borrowed
                        borrowed.setBorrowedList(viewModel.borrowedList)

                        val best = BestAdapter(::navigateDetailWith, requireContext())
                        binding.rvHomeBest.adapter = best
                        best.setBestList(viewModel.bestList)

                        val newbook = NewAdapter(::navigateDetailWith, requireContext())
                        binding.rvHomeNew.adapter = newbook
                        newbook.setNewList(viewModel.newList)

                        val category = CategoryAdapter(::navigateDetailWith, requireContext())
                        binding.rvHomeCategory.adapter = category
                        category.setCategoryList(viewModel.categoryList)

                        // 그리드 적용
                        val gridLayoutManager = GridLayoutManager(activity, 2)
                        gridLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
                        binding.rvHomeBest.layoutManager = gridLayoutManager

                        binding.btnHomeSearch.setOnClickListener {
                            navigateToSearch()
                        }


                    } else {
                        Snackbar.make(binding.root, "데이터를 불러오는데 실패했습니다", Snackbar.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<HomeResponse>, t: Throwable) {
                    Snackbar.make(binding.root, "네트워크에 문제가 생겼습니다", Snackbar.LENGTH_SHORT).show()
                }

            })
    }
    private fun navigateDetailWith(id: Int) {
        val intent = Intent(requireContext(), DetailActivity::class.java).apply {
            putExtra("id", id)
        }
        startActivity(intent)
    }

    private fun navigateToSearch() {
        val intent = Intent(requireContext(), SearchActivity::class.java)
        startActivity(intent)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
