package com.whatthefar.presentation.ui.main

import android.os.Bundle

interface MainContract {
    interface View

    interface Presenter {
        fun onInit(savedInstanceState: Bundle?, mainViewModel: MainViewModel)
    }
}