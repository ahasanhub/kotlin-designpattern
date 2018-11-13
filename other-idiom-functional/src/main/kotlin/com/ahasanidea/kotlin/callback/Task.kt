package com.ahasanidea.kotlin.callback

abstract class Task {
    fun executeWith(callback: Callback){
        execute()
        callback.call()
    }
    abstract fun execute()
}