package com.iseinc.data.cache

import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.ObservableTransformer
import java.util.concurrent.TimeUnit

class CacheTransformer<T>(private val time: Long, private val unit: TimeUnit) : ObservableTransformer<T, T> {

    override fun apply(upstream: Observable<T>): ObservableSource<T> {
        return CacheObservable(upstream, time, unit)
    }
}