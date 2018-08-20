package com.iseinc.data.cache

import io.reactivex.Observable
import io.reactivex.Observer
import java.util.concurrent.TimeUnit

class CacheObservable<T>(
        upstream: Observable<T>,
        private val time: Long,
        private val unit: TimeUnit
) : Observable<T>() {

    private val replayUpstream = upstream.replay()
    private var isError = false
    private var lastConnectedTime = 0L

    override fun subscribeActual(observer: Observer<in T>) {
        connectIfTimeout()
        replayUpstream
                .doOnError { isError = true }
                .subscribe(observer)
    }

    private fun connectIfTimeout() {
        if (isError || System.currentTimeMillis() - lastConnectedTime >= unit.toMillis(time)) {
            isError = false
            lastConnectedTime = System.currentTimeMillis()
            replayUpstream.connect()
        }
    }
}