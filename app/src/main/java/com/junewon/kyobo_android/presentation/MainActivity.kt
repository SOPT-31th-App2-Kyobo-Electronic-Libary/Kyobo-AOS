package com.junewon.kyobo_android.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.junewon.kyobo_android.R
import com.junewon.kyobo_android.databinding.ActivityMainBinding
import com.junewon.kyobo_android.presentation.home.HomeFragment
import com.junewon.kyobo_android.presentation.mypage.MyPageFragment
import com.junewon.kyobo_android.util.navigateTo
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        binding.bnvMain.run {
            setOnItemSelectedListener { onNavigationItemSelected(it.itemId) }
        }
    }

    private fun onNavigationItemSelected(itemId: Int): Boolean {
        when (itemId) {
            R.id.navigation_home -> navigateTo<HomeFragment>(R.id.fc_main)
            R.id.navigation_my_page -> navigateTo<MyPageFragment>(R.id.fc_main)
            R.id.navigation_category -> navigateTo<CategoryFragment>(R.id.fc_main)
            R.id.navigation_notification -> navigateTo<NotificationFragment>(R.id.fc_main)
            else -> Timber.e(IllegalArgumentException("itemId: $itemId"))
        }
        return true
    }
}
