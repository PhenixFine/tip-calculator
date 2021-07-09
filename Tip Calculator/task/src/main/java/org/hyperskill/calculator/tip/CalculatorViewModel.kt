package org.hyperskill.calculator.tip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    private var bill = ""
    private var percent = 0
    private val result = MutableLiveData<String>()
    val getResult: LiveData<String>
        get() = result

    fun billChange(text: String) {
        bill = text
        updateResult()
    }

    fun percentChange(number: Int) {
        percent = number
        updateResult()
    }

    private fun updateResult() {
        result.value = if (bill == "") "" else "Bill value: $bill, tip percentage: $percent%"
    }
}