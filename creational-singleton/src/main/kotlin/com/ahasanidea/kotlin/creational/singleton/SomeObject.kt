package com.ahasanidea.kotlin.creational.singleton

object SomeObject :SomeInterface{
    override fun someFunction():String{
        return "Kotlin"
    }
}
interface SomeInterface{
    fun someFunction():String
}