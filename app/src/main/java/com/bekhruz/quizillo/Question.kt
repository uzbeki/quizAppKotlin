package com.bekhruz.quizillo

data class Question(
    val id :Int,
    val question:String,
    val image: Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val correctAnswer: Int
)
