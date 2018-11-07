package com.ahasanidea.kotlin.observer.one

class BinaryObserver(val subject: Subject): Observer() {
    init {
        subject.attach(this)
    }
    override fun update(state: Int) {
        println("Binary String: ${Integer.toBinaryString(state)}")
    }
}