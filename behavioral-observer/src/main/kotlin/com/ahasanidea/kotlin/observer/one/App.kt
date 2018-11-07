package com.ahasanidea.kotlin.observer.one

/**
 * This is Client
 */
fun main(){
    val subject=Subject()
    BinaryObserver(subject)
    OctalObserver(subject)
    HexObserver(subject)
    subject.changeState(12)
}