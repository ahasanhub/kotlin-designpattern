package com.ahasanidea.kotlin.callback

class SimpleTask : Task() {
    override fun execute() {
        println("Perform some important activity and after call callback method.")
    }
}