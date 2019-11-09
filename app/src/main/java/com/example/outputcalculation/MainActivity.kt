package com.example.outputcalculation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Sendボタン押下時
    @SuppressLint("SetTextI18n")
    fun tapCalculationButton(view: View) {

        // 入力値の取得
        val num1Str = num1.text.toString()
        val num2Str = num2.text.toString()
        val symbolStr = spinner.selectedItem.toString()

        // 入力値の計算結果を取得
        val result = Calculator().execCalculation(num1Str, num2Str, symbolStr)

        // 計算結果を画面に表示
        resultTextView.text = num1Str + symbolStr + num2Str + "=" + result.toString()
    }
}
