package com.example.myapplicationassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplicationassignment.databinding.FragmentCalculatorBinding




class CalculatorFragment: Fragment() {

    private var _binding: FragmentCalculatorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val _binding = FragmentCalculatorBinding.inflate(inflater, container, false)

        // Set up button click listeners
        setupButtonListeners()

        return binding.root
    }

    private fun setupButtonListeners() {
        // Number buttons
        binding.button1.setOnClickListener { appendToExpression("1") }
        binding.button2.setOnClickListener { appendToExpression("2") }
        binding.button3.setOnClickListener { appendToExpression("3") }
        binding.button4.setOnClickListener { appendToExpression("4") }
        binding.button5.setOnClickListener { appendToExpression("5") }
        binding.button6.setOnClickListener { appendToExpression("6") }
        binding.button7.setOnClickListener { appendToExpression("7") }
        binding.button8.setOnClickListener { appendToExpression("8") }
        binding.button9.setOnClickListener { appendToExpression("9") }
        binding.button0.setOnClickListener { appendToExpression("0") }

        // Operation buttons
        binding.buttonAdd.setOnClickListener { appendToExpression("+") }
        binding.buttonSubtract.setOnClickListener { appendToExpression("-") }
        binding.buttonMultiply.setOnClickListener { appendToExpression("*") }
        binding.buttonDivide.setOnClickListener { appendToExpression("/") }

        // Equals button
        binding.buttonEquals.setOnClickListener { calculateResult() }


    }

    private fun appendToExpression(value: String) {
        binding.textView2.append(value)
    }

    private fun calculateResult() {
        val expression = binding.textView2.text.toString()
        try {
            // Simple evaluation of the expression (you might want to use a library for complex expressions)
            val result = evaluateExpression(expression)
            displayResult(result.toString())
        } catch (e: Exception) {
            displayResult("Error")
        }
    }

    private fun displayResult(result: String) {

    }

    private fun evaluateExpression(expression: String): Double {
        // This is a very basic evaluation; consider using a library like exp4j for full expression evaluation
        val parts = expression.split(" ")
        val firstNumber = parts[0].toDouble()
        val operator = parts[1]
        val secondNumber = parts[2].toDouble()

        return when (operator) {
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "*" -> firstNumber * secondNumber
            "/" -> if (secondNumber != 0.0) firstNumber / secondNumber else Double.NaN
            else -> 0.0
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clear the binding reference to avoid memory leaks
    }
}



