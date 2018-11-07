package com.ahasanidea.kotlin.observer.one

class HexObserver(val subject: Subject): Observer() {
    init {
        subject.attach(this)
    }
    override fun update(state: Int) {
        println("Hexa String: ${Integer.toHexString(state)}")
    }
}