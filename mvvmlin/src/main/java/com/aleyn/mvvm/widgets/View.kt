package com.aleyn.mvvm.widgets

import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.marginTop
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.ClickUtils


/**
 * @author azheng
 * @date 2020/9/21.
 * email：wei.azheng@foxmail.com
 * description：
 */

/**
 * 解决连续单击问题
 */
fun View.onSingleClick(action: (view: View) -> Unit) {
    ClickUtils.applySingleDebouncing(this, 500) {
        action.invoke(this)
    }
}

/**
 * 设置状态栏间距(沉浸式)
 */
fun View.setStatusBarPadding() {
    this.setPadding(0, BarUtils.getNavBarHeight(), 0, 0)
}

/**
 * 设置状态栏间距(沉浸式)
 */
fun View.setStatusBarMarginHeight() {
    val params = LinearLayout.LayoutParams(
        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
    )
    params.setMargins(10, BarUtils.getNavBarHeight(), 10, 10)
    this.layoutParams = params

}