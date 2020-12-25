package com.bekhruz.quizillo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.Toast
import com.bekhruz.quizillo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
        binding.btnStart.setOnClickListener {
            if (binding.nameInput.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "I said Enter your NAME! Dumbo!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}