package com.aleyn.mvvm.base

import android.app.Application
import android.content.Context
import com.aleyn.mvvm.BuildConfig
import com.aleyn.mvvm.app.GlobalConfig
import com.aleyn.mvvm.app.MVVMLin
import com.alibaba.android.arouter.launcher.ARouter

/**
 *   @auther : Aleyn
 *   time   : 2019/11/12
 */
open class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (isDebug()) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog()     // 打印日志
            ARouter.openDebug()   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this) // 尽可能早，推荐在Application中初始化
    }
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MVVMLin.install(GlobalConfig().apply {
            viewModelFactory = ViewModelFactory()
        })

    }
    public fun isDebug():Boolean{
        return BuildConfig.DEBUG
    }
}