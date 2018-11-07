package com.ahasanidea.kotlin.creational.singleton

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Test

import org.junit.Assert.*

class SomeObjectTest {

    @Test
    fun test_with_mock() {
        //setup,given,arrange
        val mock=mock<SomeInterface>{on {someFunction()} doReturn "42"}
        //exercise,when,act
        //whenever(mock.someFunction()).thenReturn("42")
        val answer=mock.someFunction()
        //verify,then,assert
        assertEquals("42",answer)
    }
}