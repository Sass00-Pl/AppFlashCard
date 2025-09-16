package com.example.flashcardapp

import  android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)}
    val question = intent.getStringExtra("question_key")
    val answer = intent.getStringExtra("answer_key")
    findViewById<TextView>(R.id.questionTextField).setText(question)
    findViewById<TextView>(R.id.FlashCard_Answer).setText(answer)}

