package com.example.ravqna

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var Username = findViewById(R.id.Username) as EditText
    var Password = findViewById(R.id.Password) as EditText
    var Register = findViewById(R.id.Register) as Button
    @SuppressLint("WrongViewCast")
    var Signup = findViewById<Button>(R.id.Signup)
}
