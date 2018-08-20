package com.whatthefar.presentation.di

interface ComponentBuilder<out C> {
    fun build(): C
}