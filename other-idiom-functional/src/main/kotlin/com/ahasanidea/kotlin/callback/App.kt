package com.ahasanidea.kotlin.callback

fun main(){
    println("Start simple execution")
    var task=SimpleTask()
    task.executeWith(object : Callback{
        override fun call() {
            println("I'm done now.")
        }
    })
}