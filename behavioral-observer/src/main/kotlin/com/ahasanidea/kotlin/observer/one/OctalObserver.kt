package com.ahasanidea.kotlin.observer.one

class OctalObserver (val subject: Subject): Observer() {
    init {
        subject.attach(this)
    }
    override fun update(state: Int) {
        println("Octal String: ${Integer.toOctalString(state)}")
    }
}