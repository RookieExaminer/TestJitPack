package com.azheng.testjitpack

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.aleyn.mvvm.base.BaseActivity
import com.aleyn.mvvm.base.NoViewModel

class MainActivity : BaseActivity<NoViewModel, ViewDataBinding>() {

    override fun initData() {

    }

    override fun initView(savedInstanceState: Bundle?) {
    }

    override fun layoutId(): Int {
      return R.layout.activity_main
    }
}