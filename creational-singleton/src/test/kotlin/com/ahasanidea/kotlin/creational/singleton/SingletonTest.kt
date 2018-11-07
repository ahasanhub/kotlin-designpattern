package com.ahasanidea.kotlin.creational.singleton

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class SingletonTest {

    @Test
    fun getMessage() {
        val message=Singleton.getMessage()
        Assert.assertEquals("Ahasan",message)
    }
}