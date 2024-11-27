package com.example.myapplicationassignment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class ConverterFragment {
    // Initialize UI components and set up event listeners
    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_converter, container, false)

        val inputValue = view.findViewById<EditText>(R.id.input_value)
        val outputValue = view.findViewById<TextView>(R.id.output_value)
        val spinnerUnits = view.findViewById<Spinner>(R.id.spinner_units)

        // Set up spinner and conversion logic
        inputValue.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Perform conversion based on input value and selected unit
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        return view

    }
}
