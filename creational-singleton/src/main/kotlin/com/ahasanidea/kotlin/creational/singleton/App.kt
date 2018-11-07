package com.ahasanidea.kotlin.creational.singleton

fun main(){
    println(Greeting().greet())
    println(Singleton.getMessage())
    for (i in 1..3)
    {
        println(CounterSingleton.increment())
    }

   println(SomeObject.someFunction())
}