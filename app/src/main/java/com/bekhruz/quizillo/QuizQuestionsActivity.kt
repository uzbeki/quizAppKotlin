package com.bekhruz.quizillo

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.children
import androidx.core.view.forEach
import com.airbnb.paris.extensions.style
import com.bekhruz.quizillo.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuizQuestionsBinding

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswer: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mQuestionsList = Constants.getQuestions()

        setQuestion()
        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                binding.optionOne.id -> {
                    binding.optionOne.style(R.style.selectedOptionStyle)
                    binding.optionTwo.style(R.style.optionsStyle)
                    binding.optionThree.style(R.style.optionsStyle)
                }
                binding.optionTwo.id -> {
                    binding.optionTwo.style(R.style.selectedOptionStyle)
                    binding.optionOne.style(R.style.optionsStyle)
                    binding.optionThree.style(R.style.optionsStyle)
                }
                binding.optionThree.id -> {
                    binding.optionThree.style(R.style.selectedOptionStyle)
                    binding.optionTwo.style(R.style.optionsStyle)
                    binding.optionOne.style(R.style.optionsStyle)
                }
            }
//            findViewById<RadioButton>(checkedId).setBackgroundResource(R.drawable.selected_option_border_bg)
        }

        binding.btnSubmitAnswer.setOnClickListener {

            validateAnswer()
        }

    }

    fun setQuestion(): Unit {
        val question = mQuestionsList!!.get(mCurrentPosition - 1)

        binding.question.text = question!!.question
        binding.questionImage.setImageResource(question.image)

        binding.questionProgressBar.progress = mCurrentPosition
        binding.questionProgressBar.max = mQuestionsList!!.size
        binding.progressStatus.text = "${mCurrentPosition}/${binding.questionProgressBar.max}"

        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        mCorrectAnswer = question.correctAnswer
    }

    fun validateAnswer() {
        val selectedOption: View? = binding.radioGroup.getChildAt(binding.radioGroup.checkedRadioButtonId)
        val correctOption:View? = when (mCorrectAnswer) {
            1 -> binding.optionOne
            2 -> binding.optionTwo
            else -> binding.optionThree
        }
        if (selectedOption == correctOption) {
            correctOption?.style(R.style.correctAnswerStyle)

        } else {
            selectedOption?.style(R.style.wrongAnswerStyle)

        }
        mCurrentPosition++
        setQuestion()
    }
}