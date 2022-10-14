package com.example.kockadobas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var rlayout : RelativeLayout
    private lateinit var lnlayout : LinearLayout
    private lateinit var dicelayout : LinearLayout
    private lateinit var right : ImageView
    private lateinit var left : ImageView
    private lateinit var diceone : Button
    private lateinit var dicetwo : Button
    private lateinit var btnThrow : Button
    private lateinit var btnReset : Button
    private lateinit var numbers : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        diceone.setOnClickListener{
            right.setVisibility(View.GONE);
        }

        dicetwo.setOnClickListener{
            right.setVisibility(View.VISIBLE);
        }
    }

    fun init(){
        rlayout = findViewById(R.id.rlayout)
        lnlayout = findViewById(R.id.lnlayout)
        dicelayout = findViewById(R.id.dicelayout)
        right = findViewById(R.id.right)
        left = findViewById(R.id.left)
        diceone = findViewById(R.id.diceone)
        dicetwo = findViewById(R.id.dicetwo)
        btnThrow = findViewById(R.id.btnThrow)
        btnReset = findViewById(R.id.btnReset)
        numbers = findViewById(R.id.numbers)
    }
}