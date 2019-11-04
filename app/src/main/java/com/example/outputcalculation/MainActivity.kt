package com.example.ooutputcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Sendボタン押下時
    @SuppressLint("SetTextI18n")
    fun tapCalculationButton(view: View) {
        // 計算処理を行う
        val num1Str = (findViewById<EditText>(R.id.num1)).text.toString()
        val num2Str = (findViewById<EditText>(R.id.num2)).text.toString()
        val symbolStr = (findViewById<Spinner>(R.id.spinner)).selectedItem.toString()
        val result = Calculator().execCalculation(num1Str, num2Str, symbolStr)
        resultTextView.text = num1Str + symbolStr + num2Str + "=" + result.toString()
    }
}
