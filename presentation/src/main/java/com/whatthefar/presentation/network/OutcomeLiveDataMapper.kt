package com.whatthefar.presentation.network

import androidx.lifecycle.MutableLiveData

/**
 * Extension function to push a failed event with an exception to the observing outcome
 * */
fun <T> MutableLiveData<Outcome<T>>.failed(e: Throwable) {
    value = Outcome.loading(false)
    value = Outcome.failure(e)
}

/**
 * Extension function to push  a success event with data to the observing outcome
 * */
fun <T> MutableLiveData<Outcome<T>>.success(t: T) {
    value = Outcome.loading(false)
    value = Outcome.success(t)
}

/**
 * Extension function to push the loading status to the observing outcome
 * */
fun <T> MutableLiveData<Outcome<T>>.loading(isLoading: Boolean) {
    value = Outcome.loading(isLoading)
}