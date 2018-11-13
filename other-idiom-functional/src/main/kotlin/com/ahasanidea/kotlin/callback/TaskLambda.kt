package com.ahasanidea.kotlin.callback

 class TaskLambda {
    fun executeWith(callback: ()->Unit){
        execute()
        callback()
    }
    fun execute(){
        println("Perform some important activity and after call callback method.")
    }
}