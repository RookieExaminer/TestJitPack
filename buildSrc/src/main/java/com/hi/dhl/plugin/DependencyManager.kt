/*
 * Copyright 2020. hi-dhl (Jack Deng)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hi.dhl.plugin


/**
 * <pre>
 *     author: dhl
 *     date  : 2020/7/3
 *     desc  : 如果数量少的话，放在一个类里面就可以，如果数量多的话，可以拆分为多个类
 * </pre>
 */

object Versions {
    val retrofit = "2.9.0"
    val okhttpLogging = "3.9.0"
    val appcompat = "1.2.0"
    val coreKtx = "1.3.1"
    val constraintlayout = "2.0.1"
    val paging = "3.0.0-alpha02"
    val timber = "4.7.1"
    val kotlin = "1.4.0"
    val koin = "2.1.5"
    val work = "2.2.0"
    val room = "2.3.0-alpha01"
    val cardview = "1.0.0"
    val recyclerview = "1.0.0"
    val fragment = "1.3.0-alpha06"
    val anko = "0.10.8"
    val swiperefreshlayout = "1.0.0"
    val junit = "4.12"
    val junitExt = "1.1.2"
    val espressoCore = "3.3.0"
    val jDatabinding = "1.0.1"
    val progressview = "1.0.0"
    val runtime = "0.11.0"
    val hit = "2.28-alpha"
    val hitViewModule = "1.0.0-alpha01"
    val appStartup = "1.0.0-alpha01"
    val material = "1.2.1"
    val extensions = "2.2.0"
    val annotation = "1.1.0"
    val materialDialogsLifecycle = "3.1.1"
    val materialDialogsCore = "3.1.1"
    val glide = "4.11.0"
    val glideCompiler = "4.11.0"
    val utilcodex = "1.29.0"
    val navigation = "2.3.0"
    val alibabaFastjson = "1.2.59"
    val arouter = "1.5.0"
    val arouterCompiler = "1.2.2"
    val banner = "2.1.0"
    val baseRecyclerViewAdapterHelper = "3.0.4"
    val smartRefreshLayout = "2.0.1"
}


object AndroidX {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"

    val workRuntime = "androidx.work:work-runtime:${Versions.work}"
    val workTesting = "androidx.work:work-testing:${Versions.work}"
    val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val swiperefreshlayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayout}"

    val appStartup = "androidx.startup:startup-runtime:${Versions.appStartup}"

    //viewModel and LiveData
    val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.extensions}"
    val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.extensions}"
    val annotation = "androidx.annotation:annotation:${Versions.annotation}"

    //navigation
    val navigationFragment = "androidx.navigation:navigation-fragment:${Versions.navigation}"
    val navigationUI = "androidx.navigation:navigation-ui:${Versions.navigation}"
    val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationUIKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

}

object Android {
    val material = "com.google.android.material:material:${Versions.material}"
}

object Hilt {
    val daggerRuntime = "com.google.dagger:hilt-android:${Versions.hit}"
    val daggerCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hit}"
    val viewModule = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hitViewModule}"
    val compiler = "androidx.hilt:hilt-compiler:${Versions.hitViewModule}"
}

object Coil {
    val runtime = "io.coil-kt:coil:${Versions.runtime}"
}

object Room {
    val runtime = "androidx.room:room-runtime:${Versions.room}"
    val compiler = "androidx.room:room-compiler:${Versions.room}"
    val ktx = "androidx.room:room-ktx:${Versions.room}"
    val rxjava2 = "androidx.room:room-rxjava2:${Versions.room}"
    val testing = "androidx.room:room-testing:${Versions.room}"
}

object Fragment {
    val runtime = "androidx.fragment:fragment:${Versions.fragment}"
    val runtimeKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Kt {
    val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

}

object Koin {
    val core = "org.koin:koin-core:${Versions.koin}"
    val androidCore = "org.koin:koin-android:${Versions.koin}"
    val viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val androidScope = "org.koin:koin-android-scope:$${Versions.koin}"
}

object Anko {
    val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
    val sqlite = "org.jetbrains.anko:anko-sqlite:${Versions.anko}"
    val coroutines = "org.jetbrains.anko:anko-coroutines:${Versions.anko}"
    val design = "org.jetbrains.anko:anko-design:${Versions.anko}" // For SnackBars
}

object Retrofit {
    val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
}

object Depend {

    val junit = "junit:junit:${Versions.junit}"
    val androidTestJunit = "androidx.test.ext:junit:${Versions.junitExt}"
    val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val jDatabinding = "com.hi-dhl:jdatabinding:${Versions.jDatabinding}"
    val progressview = "com.hi-dhl:progressview:${Versions.progressview}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    //material-dialogs
    val materialDialogsLifecycle =
        "com.afollestad.material-dialogs:lifecycle:${Versions.materialDialogsLifecycle}"
    val materialDialogsCore = "com.afollestad.material-dialogs:core:${Versions.materialDialogsCore}"

    //glide图片加载
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideCompiler}"

    //Utils
    val utilcodex = "com.blankj:utilcodex:${Versions.utilcodex}"

    //fastjson解析
    val alibabaFastjson = "com.alibaba:fastjson:${Versions.alibabaFastjson}"

    //Arouter
    val arouter = "com.alibaba:arouter-api:${Versions.arouter}"
    val arouterCompiler = "com.alibaba:arouter-compiler:${Versions.arouterCompiler}"
    val banner = "com.youth.banner:banner:${Versions.banner}"
    val baseRecyclerViewAdapterHelper =
        "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.baseRecyclerViewAdapterHelper}"

    //SmartRefreshLayout
    val smartRefreshLayout =
        "com.scwang.smart:refresh-layout-kernel:${Versions.smartRefreshLayout}"     //核心必须依赖
    val smartRefreshLayoutHeader =
        "com.scwang.smart:refresh-header-classics:${Versions.smartRefreshLayout}"    //经典刷新头
}

