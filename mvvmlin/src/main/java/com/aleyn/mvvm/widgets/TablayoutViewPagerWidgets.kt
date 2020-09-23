package com.aleyn.mvvm.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.aleyn.mvvm.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.widgets_tablayout_viewpager.view.*

/**
 * @author azheng
 * @date 2020/9/21.
 * email：wei.azheng@foxmail.com
 * description：
 */
class TablayoutViewPagerWidgets : LinearLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)

    public fun initView(mAdapter: FragmentStateAdapter,mTitle: MutableList<String>) {
        View.inflate(context, R.layout.widgets_tablayout_viewpager, this)
        mViewPager2.adapter = mAdapter
        TabLayoutMediator(mTabLayout, mViewPager2) { tab, position ->
            tab.text =mTitle[position]
        }.attach()
    }

    public fun getTabLayout(): TabLayout? {
        return mTabLayout
    }

    public fun getViewPager2(): ViewPager2? {
        return mViewPager2
    }
}