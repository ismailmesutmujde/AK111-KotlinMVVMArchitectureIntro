package com.ismailmesutmujde.kotlinmvvmarchitectureintro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinmvvmarchitectureintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        bindingMain.textViewResult.text = "0"

        bindingMain.buttonSum.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val sum = number1 + number2
            bindingMain.textViewResult.text = sum.toString()
        }

        bindingMain.buttonSubtract.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val subtract = number1 - number2
            bindingMain.textViewResult.text = subtract.toString()
        }

        bindingMain.buttonMultiply.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val multiply = number1 * number2
            bindingMain.textViewResult.text = multiply.toString()
        }
        bindingMain.buttonDivide.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val divide = number1 / number2
            bindingMain.textViewResult.text = divide.toString()
        }

    }
}