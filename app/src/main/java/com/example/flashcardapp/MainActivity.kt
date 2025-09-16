package com.example.flashcardapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.flashcardapp.R.id.Add

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.Flashcard_question).setOnClickListener { //Do something here }
            findViewById<View>(R.id.Flashcard_Answer).visibility = View.VISIBLE
            findViewById<View>(R.id.Flashcard_Answer).setOnClickListener { }
            findViewById<View>(R.id.Flashcard_question).visibility = View.INVISIBLE
            val flashcardQuestion = findViewById<TextView>(R.id.Flashcard_question)
            val flashcardAnswer = findViewById<TextView>(R.id.Flashcard_Answer)
            flashcardQuestion.setOnClickListener {
                flashcardQuestion.visibility = View.INVISIBLE
                flashcardAnswer.visibility = View.VISIBLE
            }

        }
        findViewById<View>(Add).setOnClickListener {
            val intent = Intent(this, AddCardActivity2::class.java)
            startActivity(intent)

        }
    }val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult())  { result ->
    // This code is executed in StartingActivity after we come back from EndingActivity
    // This extracts any data that was passed back from EndingActivity
    val data: Intent? = result.data
    // Todo:Execute more code here

findViewById<View>(R.id.Add).setOnClickListener {
    val intent = Intent(
        this,
        AddCardActivity2::class.java
    )
    //Launch EndingActivity with the resultLauncher so we can execute more code
    // // once we come back here from EndingActivity resultLauncher. launch(intent) }
findViewById<View>(R.id.Cancel).setOnClickListener { finish() }

val SaveButton =
    findViewById<Button>(R.id.mybuttonSave)
val questionField =
    findViewById<EditText>(R.id.questionTextField)
val answerField = findViewById<EditText>(R.id.Flashcard_AnswerTextField)

SaveButton.setOnClickListener {val question = questionField.text.toString(
)
    val answer = answerField.text.toString()

    val intent = Intent(this, AddCardActivity2::class.java)
    intent.putExtra("question_key", question)
    intent.putExtra("answer_key",answer)
    startActivity(intent)
}}}}





