package com.example.flashcardapp
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.ImageView
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class AddCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_card)


        val btnsave = findViewById<ImageView>(R.id.savebouton)
        val cancel = findViewById<ImageView>(R.id.cancel)
        val editQuestion= intent.getStringExtra("editQuestion")
        val editReponse = intent.getStringExtra("editReponse")

        findViewById<EditText>(R.id.editQuestion).setText(editQuestion)
        findViewById<EditText>(R.id.editReponse).setText(editReponse)

        cancel.setOnClickListener { //come back in the first activity.
            setResult(RESULT_CANCELED)
            finish()
        }

        btnsave.setOnClickListener {
            val editquestion = findViewById<EditText>(R.id.editQuestion).text.toString()

            val editreponse = findViewById<EditText>(R.id.editReponse).text.toString()

            val data = Intent() // create a new Intent, this is where we will put our data
            data.putExtra(
                "editquestion",
                findViewById<EditText>(R.id.editQuestion).text.toString()
            ) // puts one string into the Intent, with the key as 'string1'
            data.putExtra(
                "editreponse",
                findViewById<EditText>(R.id.editReponse).text.toString()
            )

            // puts another string into the Intent, with the key as 'string2

            setResult(RESULT_OK, data) // set result code and bundle data for response
            finish()
        }
    }
}
