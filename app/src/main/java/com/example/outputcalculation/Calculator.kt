package com.example.outputcalculation

class Calculator {

    /**
     * 計算を行うメソッド
     * @param inputNum1 値１
     * @param inputNum2 値２
     * @param inputOperatorType 四則演算子
     * @return 計算結果
     */
    fun execCalculation(inputNum1: String, inputNum2: String, inputOperatorType: String): Int {
        // 戻り値の初期化
        var result = 0

        // 計算したい値を文字で受け取るので、数値に変換
        val num1 = Integer.parseInt(inputNum1)
        val num2 = Integer.parseInt(inputNum2)

        // 演算子の種類によって計算を行う
        when(inputOperatorType){
            "+" -> {
                result = num1 + num2
            }
            "-" -> {
                result = num1 - num2
            }
            "*" -> {
                result = num1 * num2
            }
            "/" -> {
                result = num1 / num2
            }
        }

        // 計算結果の返却
        return result

    }
}