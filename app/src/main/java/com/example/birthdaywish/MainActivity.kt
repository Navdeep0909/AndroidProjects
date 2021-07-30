package com.example.birthdaywish

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun birthdayCard(view: View) {

        val name = findViewById<EditText>(R.id.nameInput)

        val nameInput = name.editableText.toString()
        if(nameInput.trim()==""){
            Toast.makeText(this, "Please Enter Name!", Toast.LENGTH_SHORT).show()
        }
        else {
            val intent = Intent(this, BirthdayWish::class.java)
            intent.putExtra("name", nameInput)
            startActivity(intent)
        }
    }
}