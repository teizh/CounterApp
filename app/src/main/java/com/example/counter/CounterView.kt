package com.example.counter

interface CounterView {

    fun showCount(count: String)
    fun showToastMessage(message: String)
    fun setColorGreen(color:Int)
}