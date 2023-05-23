package com.example.counter

import android.graphics.Color

class Presenter {
    lateinit var view: CounterView
    var model = CounterModel()

    fun increment() {
        model.increment()
        view.showCount(model.count.toString())
        if (model.count==10){
            view.showToastMessage("Congratulations")
        }else if (model.count==15){
            view.setColorGreen(Color.GREEN)
        }
    }

    fun init(view: CounterView) {
        this.view = view
    }

    fun displayToastMessage(message: String) {
        view.showToastMessage(message)
    }

}