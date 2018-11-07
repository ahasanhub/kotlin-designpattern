package com.ahasanidea.kotlin.observer.one

/**
 * This is subject
 */
class Subject {
    var observers= mutableListOf<Observer>()
    var state=0
    fun changeState(s:Int){
        state=s
        notifyAllObservers()
    }
    fun attach(observer: Observer){
        observers.add(observer)
    }
    fun detach(observer: Observer){
        observers.remove(observer)
    }
    fun notifyAllObservers(){
        for (o in observers)
            o.update(state)
    }
}
