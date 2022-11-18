package com.junewon.kyobo_android.util

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace

/**
 * Activity에서 Framgent replace 하는 함수
 */
inline fun <reified T : Fragment> AppCompatActivity.navigateTo(
    @IdRes fragmentContainerId: Int,
    tag: String? = null,
    action: () -> Unit = {}
) {
    supportFragmentManager.commit {
        replace<T>(fragmentContainerId, tag)
        action()
        setReorderingAllowed(true)
    }
}

/**
 * Fragment에서 Framgent replace 하는 함수
 */
inline fun <reified T : Fragment> Fragment.navigateTo(
    @IdRes fragmentContainerId: Int,
    tag: String? = null,
    action: () -> Unit = {}
) {
    parentFragmentManager.commit {
        replace<T>(fragmentContainerId, tag)
        action()
        setReorderingAllowed(true)
    }
}
