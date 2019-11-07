package com.example.outputcalculation

class Calculator {

    /**
     * 計算を行うメソッド
     * @param inp01 値１
     * @param inp02 値２
     * @param inpOper 四則演算子
     * @return 計算結果
     */
    fun execCalculation(inp01: String, inp02: String, inpOper: String): Int {
        //戻り値の初期化
        var result = 0

        //計算したい値を文字で受け取るので、数値に変換
        val num1 = Integer.parseInt(inp01)
        val num2 = Integer.parseInt(inp02)

        //演算子の種類によって計算を行う
        when(inpOper){
            "+" -> {
                result = num1 + num2
            }
            "-" -> {
                result = num1 + num2
            }
            "*" -> {
                result = num1 * num2
            }
            "/" -> {
                result = num1 / num2
            }
        }

        //計算結果の返却
        return result

    }
}