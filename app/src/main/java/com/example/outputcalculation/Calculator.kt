package com.example.outputcalculation

class Calculator {

    /*
    計算を行うメソッド
     引き数：画面に入力された値１、２、四則演算
     戻り値：計算結果
     */

    fun execCalculation(x: String, y: String, A: String): Int {
        //戻り値の初期化
        var result = 0

        //計算したい値を文字で受け取るので、数値に変換
        val num1 = Integer.parseInt(x)
        val num2 = Integer.parseInt(y)

        //演算子の種類によって計算を行う
        if(A == "+"){
            result = num1 + num2

        }else if(A == "-"){
            result = num1 - num2
        }else if(A == "*"){
            result = num1 * num2
        }else if(A == "/"){
            result = num1 / num2
        }

        /*
        try {
            //計算したい値を文字で受け取るので、数値に変換
            val num1 = "x".toInt()
            val num2 = "y".toInt()

            if(A == "+"){
                val total = num1 + num2
                val strTotal = total.toString()
                //result = strTotal
            }

        //変換に失敗した場合
        } catch (ex : NumberFormatException) {
            result = "失敗"
        }

         */

        //計算結果の返却
        return result

    }
}