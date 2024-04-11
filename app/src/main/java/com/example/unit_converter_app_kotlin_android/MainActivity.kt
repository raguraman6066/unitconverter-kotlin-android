package com.example.unit_converter_app_kotlin_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialize the views
        val editText:EditText=findViewById(R.id.editText)
        val btn:Button=findViewById(R.id.btn)
        val resultText:TextView=findViewById(R.id.result_text)

        //functions

        btn.setOnClickListener {
           val kilos:Double=editText.text.toString().toDouble()
            resultText.setText(""+makeConvertToPounds(kilos))
        }
    }

    fun makeConvertToPounds(kilos:Double):Double{
        var pounds=kilos*2.20462
        return pounds
    }
}