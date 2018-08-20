package com.whatthefar.presentation.ui.main

import android.content.Context
import android.content.Intent
import com.whatthefar.presentation.ui.core.ActivityArgs

class MainActivityArgs : ActivityArgs {
    override fun intent(context: Context): Intent =
            Intent(context, MainActivity::class.java)

    companion object {
        fun deserializeFrom(intent: Intent): MainActivityArgs =
                with(intent) {
                    MainActivityArgs()
                }
    }
}