package org.hyperskill.calculator.tip

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator: CalculatorViewModel by viewModels()

        calculator.getResult.observe(this, { stringResult ->
            findViewById<TextView>(R.id.text_view).text = stringResult
        })

        findViewById<EditText>(R.id.edit_text).doOnTextChanged { text, _, _, _ ->
            calculator.billChange(text?.toString() ?: "")
        }

        findViewById<Slider>(R.id.slider).addOnChangeListener { _, value, _ ->
            calculator.percentChange(value.toInt())
        }
    }
}