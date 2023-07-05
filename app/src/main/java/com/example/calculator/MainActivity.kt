package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val runningString = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setup view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // set all of the buttons to an action
        binding.clearButton.setOnClickListener { clearButtonAction() }
        binding.squareRootButton.setOnClickListener { squareButtonAction() }
        binding.decimalButton.setOnClickListener { decimalButtonAction() }
        binding.divideButton.setOnClickListener { divideButtonAction() }
        binding.multiplyButton.setOnClickListener { multiplyButtonAction() }
        binding.addButton.setOnClickListener { addButtonAction() }
        binding.subButton.setOnClickListener { subButtonAction() }
        binding.equalButton.setOnClickListener { calculate() }
        binding.nineButton.setOnClickListener { nineButtonAction() }
        binding.eightButton.setOnClickListener { eightButtonAction() }
        binding.sevenButton.setOnClickListener { sevenButtonAction() }
        binding.sixButton.setOnClickListener { sixBittonAction() }
        binding.fiveButton.setOnClickListener { fiveButtonAction() }
        binding.fourButton.setOnClickListener { fourButtonAction() }
        binding.threeButton.setOnClickListener { threeButtonAction() }
        binding.twoButton.setOnClickListener { twoButtonAction() }
        binding.oneButton.setOnClickListener { oneButtonAction() }
        binding.zeroButton.setOnClickListener { zeroButtonAction() }
    }

    private fun zeroButtonAction() {
        binding.viewSpace.text = "zero pressed"
    }

    private fun oneButtonAction() {
        binding.viewSpace.text = "one button"
    }

    private fun twoButtonAction() {
        binding.viewSpace.text = "two pressed"
    }

    private fun threeButtonAction() {
        binding.viewSpace.text = "three pressed"
    }

    private fun fourButtonAction() {
        binding.viewSpace.text = "four prewssed"
    }

    private fun fiveButtonAction() {
        binding.viewSpace.text = "five pressed"
    }

    private fun sixBittonAction() {
        binding.viewSpace.text = "six pressed"
    }

    private fun eightButtonAction() {
        binding.viewSpace.text = "eight pressed"
    }

    private fun nineButtonAction() {
        binding.viewSpace.text = "nine pressed"
    }

    private fun subButtonAction() {
        binding.viewSpace.text = "subtract pressed"
    }

    private fun addButtonAction() {
        binding.viewSpace.text = "add pressed"
    }

    private fun multiplyButtonAction() {
        binding.viewSpace.text = "mulitply pressed"
    }

    private fun sevenButtonAction() {
        binding.viewSpace.text ="seven pressed"
    }

    private fun divideButtonAction() {
        binding.viewSpace.text = "divide pressed"
    }

    private fun squareButtonAction() {
        binding.viewSpace.text = "Squared pressed"
    }

    private fun clearButtonAction() {
        binding.viewSpace.text = "Clear pressed"
    }

    private fun decimalButtonAction() {
        binding.viewSpace.text = "decimal pressed"
    }

    private fun equalButtonAction() {
        // Call the displayCalculation function when button pressed
    }
    private fun displayCalculation() {
        TODO("Implement the text view to have the calculation")
    }

    private fun calculate() {

    }
}