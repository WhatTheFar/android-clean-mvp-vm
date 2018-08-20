package com.whatthefar.presentation.ui.core

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * The best way to launch yourself an activity. Your implementation should enable the following api:
 *
 * ```kotlin
 * YourActivityArgs(param1, param2)
+                .launch(activityContext);
 * ```
 *
 * Your deserialization (from an intent) could look like:
 *
 * ```kotlin
 * YourActivityArgs.of(intent)
 * ```
 */
interface ActivityArgs {

    /**
     * @return returns an intent that can be used to launch this activity.
     */
    fun intent(context: Context): Intent

    /**
     * Launches the activity given your activity context.
     *
     * The default implementation uses the intent generated from [intent]
     */
    fun launch(context: Context) = context.startActivity(intent(context))

    /**
     * Launches the activity for result given your activity context.
     *
     * The default implementation uses the intent generated from [intent]
     */
    fun launchForResult(activity: Activity, requestCode: Int, option: Bundle? = null) =
            activity.startActivityForResult(intent(activity), requestCode, option)
}