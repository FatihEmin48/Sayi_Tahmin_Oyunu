package com.fatiheminkarahan.sayitahminoyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rnum = randomNumber()

        val num = findViewById(R.id.num) as EditText

        val check = findViewById(R.id.check) as Button

        val rastgeleSayi = ArrayList<String>()
        val tahminSayi = ArrayList<String>()

        check.setOnClickListener {
            val enteredNum = num.text.toString()

            if (enteredNum.isEmpty()){
                Toast.makeText(applicationContext,"Bir sayı giriniz", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(rnum != Integer.parseInt(enteredNum)){
                /*
                for (i in 0..3) {
                    tahminSayi.add(num.toString().get(i).toString())
                    rastgeleSayi.add(rnum.toString().get(i).toString())
                }

                 */

                Toast.makeText(applicationContext,"Tekrar deneyiniz sayı " + enteredNum + " değil", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(applicationContext,"Buldunuz sayı: " + enteredNum, Toast.LENGTH_SHORT).show()
                rnum = randomNumber()
            }
        }


    }

    fun randomNumber(): Int{
        return Random.nextInt(10)
    }
}