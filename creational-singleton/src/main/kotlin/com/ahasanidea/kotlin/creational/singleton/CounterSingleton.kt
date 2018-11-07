package com.ahasanidea.kotlin.creational.singleton

import java.util.concurrent.atomic.AtomicInteger

object CounterSingleton {
    private val counter=AtomicInteger(0)
    fun increment()= counter.getAndIncrement()
}