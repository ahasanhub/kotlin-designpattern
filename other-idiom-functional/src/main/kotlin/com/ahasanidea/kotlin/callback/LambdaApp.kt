package com.ahasanidea.kotlin.callback

fun main(){
    println("Start lambda execution")
    val task=TaskLambda()
    //var callback:Callback=fun { println("df")}
    task.executeWith{ println("I'm now done")}
}