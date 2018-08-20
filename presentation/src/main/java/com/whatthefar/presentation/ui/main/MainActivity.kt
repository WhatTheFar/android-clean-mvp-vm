package com.whatthefar.presentation.ui.main

import android.os.Bundle
import com.whatthefar.presentation.R
import com.whatthefar.presentation.extension.replaceFragmentInActivity
import com.whatthefar.presentation.ui.core.BaseDaggerActivity

class MainActivity : BaseDaggerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            replaceFragmentInActivity(MainFragment.newInstance(), R.id.container)
        }
    }
}
