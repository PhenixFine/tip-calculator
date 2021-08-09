package org.hyperskill.calculator.tip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.DecimalFormat

class CalculatorViewModel : ViewModel() {
    private var bill = ""
    private var percent = 0.0
    private val tip = { DecimalFormat("0.00").format(bill.toDouble() * percent / 100) }
    private val updateResult = { result.value = if (bill == "" || bill == ".") "" else "Tip amount: ${tip()}" }
    private val result = MutableLiveData<String>()
    val getResult: LiveData<String>
        get() = result

    fun billChange(text: String) {
        bill = text
        updateResult()
    }

    fun percentChange(number: Double) {
        percent = number
        updateResult()
    }
}