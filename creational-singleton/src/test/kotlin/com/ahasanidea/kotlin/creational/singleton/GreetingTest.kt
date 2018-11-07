package com.ahasanidea.kotlin.creational.singleton

import org.junit.Assert
import org.junit.Test

class GreetingTest {

    @Test
    fun getGreeting() {
        val message=Greeting().greet()
        Assert.assertEquals("Ahasan",message)
        Assert.assertTrue("Ahasan",true)
    }
}