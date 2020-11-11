package com.example.unit5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        findViewById<Button>(R.id.CL).setOnClickListener { foo() }
    }

    fun foo() {

        val intent1 = Intent(this, MainActivity3::class.java)
        val act2calender:String = findViewById<CalendarView>(R.id.act2_calender).date.toString()

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getIntExtra("seekbar",69)
        val phone =intent.getStringExtra("phone")

        intent1.putExtra("name", name)
        intent1.putExtra("email", email)
        intent1.putExtra("age", age)
        intent1.putExtra("calender", act2calender)
        intent1.putExtra("phone",phone)


        Log.i("Act2","$name, $email, $age, $act2calender")

        startActivity(intent1)
    }


}
