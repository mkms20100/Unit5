package com.example.unit5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.ER).setOnClickListener { foo() }



        val seek = findViewById<SeekBar>(R.id.Switch)
        seek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                val ageDisplay: TextView = findViewById(R.id.mainact_age)
                ageDisplay.text = "Age: ${seek.progress}"
            }

            override fun onStartTrackingTouch(seek: SeekBar) {


            }
            override fun onStopTrackingTouch(seek: SeekBar) {

                Toast.makeText(this@MainActivity, "Age: " + seek.progress + "", Toast.LENGTH_SHORT).show()

            }
        })


    }


    private fun foo(){

        val intent = Intent(this, MainActivity2::class.java)
        val name:String = findViewById<EditText>(R.id.NM).text.toString()
        val email:String = findViewById<EditText>(R.id.Email).text.toString()
        val seekValue:Int = findViewById<SeekBar>(R.id.Switch).progress

        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("seekbar", seekValue)

        startActivity(intent)

    }

}
