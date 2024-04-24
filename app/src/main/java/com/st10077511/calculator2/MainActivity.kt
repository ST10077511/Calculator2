package com.st10077511.calculator2

import android.content.Intent
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDis : TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDis = findViewById(R.id.tvDisp)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener{add()}

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{sub()}

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener{mul()}

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener{div()}

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener{sqr()}

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener{pow()}

        val btnNextScreen = findViewById<Button>(R.id.btnNextScreen)
        btnNextScreen.setOnClickListener(){
            //call the next screen
            val intent = Intent(this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }
    }

    private fun add(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDis?.text = "Please enter the valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 + intNum2

        tvDis?.text = intAnswer.toString()

    }
    private fun sub(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDis?.text = "Please enter the valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 - intNum2

        tvDis?.text = intAnswer.toString()

    }
    private fun mul(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDis?.text = "Please enter the valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 * intNum2

        tvDis?.text = intAnswer.toString()

    }
    private fun div(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()){
            tvDis?.text = "Please enter the valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var fltAnswer = 0.0

        if (intNum2 == 0) {
            tvDis?.text = "Division by zero is not allowed"
        }else {

            fltAnswer = (intNum1 / intNum2).toDouble()

        }

        tvDis?.text = fltAnswer.toString()

    }
    private fun sqr(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDis?.text = "Please enter the valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        //val intNum2 = input2.toInt()
        var fltAnswer = 0

        fltAnswer = sqr(intNum1)

        tvDis?.text = fltAnswer.toString()
    }
    private fun pow() {
        var intNum1 = etNum1?.toString()!!.toInt()
        var intNum2 = etNum2?.toString()?.toInt()
        var intAnswer: Int = 1

        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDis?.text = "Please enter valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 1

        for (i in 1..intNum2) {
            intAnswer *= intAnswer * intNum1
        }
        tvDis?.text = intAnswer.toString()
    }





