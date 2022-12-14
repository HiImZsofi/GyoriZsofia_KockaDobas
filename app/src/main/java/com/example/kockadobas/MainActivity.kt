package com.example.kockadobas

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible

var rnd1 : Int = 0
var rnd2 : Int = 0

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
        var sum : Int = 0

        diceone.setOnClickListener{
            right.setVisibility(View.GONE)
        }

        dicetwo.setOnClickListener{
            right.setVisibility(View.VISIBLE)
        }

        btnThrow.setOnClickListener{
            if(right.isVisible){
                rnd1 = (1..6).random()
                rnd2 = (1..6).random()
                sum = rnd1 + rnd2
                numbers.append(sum.toString() + " (" + rnd1.toString() + "+" + rnd2.toString() + ")\n")
                Toast.makeText(this@MainActivity, sum.toString() + " (" + rnd1.toString() + "+" + rnd2.toString() + ")", Toast.LENGTH_SHORT).show()
            }
            else{
                rnd1 = (1..6).random()
                numbers.append(rnd1.toString() + "\n")
                Toast.makeText(this@MainActivity, rnd1.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        btnReset.setOnClickListener{
            resetGame()
        }
    }

    fun resetGame(){
        var resetGameDialogBuilder = AlertDialog.Builder(this@MainActivity)
        resetGameDialogBuilder.setTitle("Reset")
        resetGameDialogBuilder.setMessage("Biztos, hogy t??r??lni szeretn?? az eddigi dob??sokat?")
        resetGameDialogBuilder.setCancelable(false)
        resetGameDialogBuilder.setNegativeButton("Nem", DialogInterface.OnClickListener {
                dialog, id ->
        })
        resetGameDialogBuilder.setPositiveButton("Igen", DialogInterface.OnClickListener {
                dialog, id -> numbers.setText("")
        })
        resetGameDialogBuilder.show()
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