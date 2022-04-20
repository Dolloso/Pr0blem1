package com.example.problem1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Button1).setOnClickListener{
            Button1(it)

        }

}
    @SuppressLint("SetTextI18n")
    private fun Button1(view: View){
        val num1 = findViewById(R.id.txt1) as EditText
        val num2 = findViewById(R.id.txt2) as EditText
        val view1 = findViewById(R.id.txtView1) as TextView

        val btn1 = findViewById(R.id.Button1) as Button


        btn1.setOnClickListener {
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result = val1 + val2;
            view1.setText(result.toString())

            if(result %2==0){ view1.text ="$result Is even" }
            else { view1.text ="$result Is Odd" }
        }



    }



    }







