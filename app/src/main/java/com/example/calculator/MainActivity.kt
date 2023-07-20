package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import kotlin.math.ceil
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var firstNumber: String = ""
    private var secondNumber: String = ""
    private var operator: String = ""
    private var ans: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setup view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // set all of the buttons to an action
        binding.clearButton.setOnClickListener { clearButtonAction() }
        binding.squareRootButton.setOnClickListener { squareButtonAction() }
        binding.divideButton.setOnClickListener { divideButtonAction() }
        binding.multiplyButton.setOnClickListener { multiplyButtonAction() }
        binding.addButton.setOnClickListener { addButtonAction() }
        binding.subButton.setOnClickListener { subButtonAction() }
        binding.equalButton.setOnClickListener { displayCalculation()} // change later
        binding.nineButton.setOnClickListener { nineButtonAction() }
        binding.eightButton.setOnClickListener { eightButtonAction() }
        binding.sevenButton.setOnClickListener { sevenButtonAction() }
        binding.sixButton.setOnClickListener { sixButtonAction() }
        binding.fiveButton.setOnClickListener { fiveButtonAction() }
        binding.fourButton.setOnClickListener { fourButtonAction() }
        binding.threeButton.setOnClickListener { threeButtonAction() }
        binding.twoButton.setOnClickListener { twoButtonAction() }
        binding.oneButton.setOnClickListener { oneButtonAction() }
        binding.zeroButton.setOnClickListener { zeroButtonAction() }
    }

    private fun zeroButtonAction() {
        binding.viewSpace.append("0")
    }

    private fun oneButtonAction() {
        binding.viewSpace.append("1")
    }

    private fun twoButtonAction() {
        binding.viewSpace.append("2")
    }

    private fun threeButtonAction() {
        binding.viewSpace.append("3")
    }

    private fun fourButtonAction() {
        binding.viewSpace.append("4")
    }

    private fun fiveButtonAction() {
        binding.viewSpace.append("5")
    }

    private fun sixButtonAction() {
        binding.viewSpace.append("6")
    }

    private fun eightButtonAction() {
        binding.viewSpace.append("8")
    }

    private fun nineButtonAction() {
        binding.viewSpace.append("9")
    }

    private fun subButtonAction() {
        operator = "-"
        if (firstNumber.isEmpty()) {
            firstNumber = binding.viewSpace.text.toString()
        }
        binding.viewSpace.text = ""
    }

    private fun addButtonAction() {
        operator = "+"
        if (firstNumber.isEmpty()) {
            firstNumber = binding.viewSpace.text.toString()
        }
        binding.viewSpace.text = ""
    }

    private fun multiplyButtonAction() {
        operator = "*"
        if (firstNumber.isEmpty()) {
            firstNumber = binding.viewSpace.text.toString()
        }
        binding.viewSpace.text = ""
    }

    private fun sevenButtonAction() {
        binding.viewSpace.append("7")
    }

    private fun divideButtonAction() {
        operator = "/"
        if (firstNumber.isEmpty()) {
            firstNumber = binding.viewSpace.text.toString()
        }
        binding.viewSpace.text = ""
    }

    private fun squareButtonAction() {
        operator = "sqrt"
        firstNumber = binding.viewSpace.text.toString()
        binding.viewSpace.text = ""
    }

    private fun clearButtonAction() {
        firstNumber = ""
        secondNumber = ""
        operator = ""
        binding.viewSpace.text = ""
    }

    private fun displayCalculation() {
        // testing to see if the running string contains all input buttons
        binding.viewSpace.text = calculate()
    }

    // checks which operator was called then calls the respective function

    private fun calculate(): String {
        if (!(firstNumber.isEmpty()) && operator == "sqrt") {
            ans = sq(firstNumber.toDouble()).toInt()
            //return "sqrt called"
        }
        if (firstNumber.isEmpty() && secondNumber.isEmpty()) {
            return "Please enter values"
        }

        if (secondNumber.isEmpty()) {
            secondNumber = binding.viewSpace.text.toString()
        }

        if (operator == "+") {
            ans = add(firstNumber.toInt(), secondNumber.toInt())
        }

        else if (operator == "-") {
            ans = sub(firstNumber.toInt(), secondNumber.toInt())
        }
        else if (operator == "*") {
            ans = multiply(firstNumber.toInt(),secondNumber.toInt())
        }
        else if (operator == "/") {
            ans = divide(firstNumber.toInt(),secondNumber.toInt())

            if (ans == -1) {
                return "Cannot divide by 0"
            }
        }

        return ans.toString()
    }

    private fun add(numOne: Int, numTwo: Int): Int {
        return numOne + numTwo
    }

    private fun sub(numOne: Int, numTwo: Int): Int {
        return numOne - numTwo
    }

    private fun multiply(numOne: Int, numTwo: Int): Int {
        return numOne * numTwo
    }

    private fun divide(numOne: Int, numTwo: Int): Int {
        if (numTwo == 0) {
            return -1
        }
        else {
            return numOne / numTwo
        }
    }

    private fun sq(numOne: Double): Double {
        // finish the logic for square root
        return sqrt(numOne)
        //return 444.4
    }
}