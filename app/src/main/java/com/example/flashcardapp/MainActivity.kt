package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.Flashcard_question) .setOnClickListener { //Do something here }
            findViewById<View>(R.id.Flashcard_Answer).visibility=View.VISIBLE
            findViewById<View>(R.id.Flashcard_Answer) .setOnClickListener {  }
            findViewById<View>(R.id.Flashcard_question).visibility= View.INVISIBLE
            val flashcardQuestion = findViewById<TextView>(R.id.Flashcard_question)
            val flashcardAnswer = findViewById<TextView>(R.id.Flashcard_Answer)
            flashcardQuestion.setOnClickListener {
                flashcardQuestion.visibility = View.INVISIBLE
                flashcardAnswer.visibility = View.VISIBLE
            }

        }

    }

}