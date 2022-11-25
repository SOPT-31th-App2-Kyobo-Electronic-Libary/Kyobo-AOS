package com.junewon.kyobo_android.presentation.mypage

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.junewon.kyobo_android.data.model.response.MyPageResponse
import com.junewon.kyobo_android.data.service.ServicePool
import com.junewon.kyobo_android.databinding.FragmentMyPageBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyPageFragment : Fragment() {
    private var _binding: FragmentMyPageBinding? = null
    private val binding: FragmentMyPageBinding
        get() = requireNotNull(_binding) { "myPageFragment _binding 오류" }
    private val myPageService = ServicePool.myPageService

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_my_page, container, false)
        _binding = FragmentMyPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getBorrowedInfo()
    }

    private fun getBorrowedInfo() {
        myPageService.getBorrowedInfo().enqueue(object: Callback<MyPageResponse> {
            override fun onResponse(
                call: Call<MyPageResponse>,
                response: Response<MyPageResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { showBorrowedInfo(it) }
                    Log.d("MYPAGE/SUCCESS", "My page 성공! $response")
                }
                else {
                    Log.d("MYPAGE/SEMI-SUCCESS", "반 정도 성공ㅋ $response")
                }
            }

            override fun onFailure(call: Call<MyPageResponse>, t: Throwable) {
                Log.d("MYPAGE/FAIL", "통신 실패.., ${t.message})")
            }
        })
    }

    private fun showBorrowedInfo(response: MyPageResponse) {
        val adapter = MyPageAdapter(response.data.books)
        binding.rvMyPageBorrowed.adapter = adapter
        val temp = DividerItemDecoration(this.context, 1)
        binding.rvMyPageBorrowed.addItemDecoration(temp)
    }
}
