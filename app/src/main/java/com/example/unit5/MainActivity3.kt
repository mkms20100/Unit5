package com.example.unit5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

   

        //Name
        val act3_name = intent.getStringExtra("name")
        findViewById<TextView>(R.id.AN).text = act3_name

        //Email
        val act3_email = intent.getStringExtra("email")
        findViewById<TextView>(R.id.AE).text = act3_email

        //Age
        val act3_age = intent.getIntExtra("age", 69)
        findViewById<TextView>(R.id.AA).text = act3_age.toString()


        //DOB(CalenderView)
        val act3dob = intent.getStringExtra("calender")
        findViewById<TextView>(R.id.AD).text = act3dob

        //Phone
        val act3phone = intent.getStringExtra("phone")
        findViewById<TextView>(R.id.AP).text = act3phone

        Log.i("Act3","$act3_name, $act3_email, $act3_age, $act3dob")

    }

}
