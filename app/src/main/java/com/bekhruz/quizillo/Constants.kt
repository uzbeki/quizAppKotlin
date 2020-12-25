package com.bekhruz.quizillo

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val ques1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "France",
            "Germany",
            1
        )
        questionsList.add(ques1)

        val ques2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Brazil",
            2
        )
        questionsList.add(ques2)

        val ques3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "France",
            "Fiji",
            1
        )
        questionsList.add(ques3)

        val ques4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Denmark",
            "Belgium",
            "Brazil",
            3
        )
        questionsList.add(ques4)

        val ques5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "New Zealand",
            "Denmark",
            "Germany",
            2
        )
        questionsList.add(ques5)

        val ques6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "India",
            "Fiji",
            "Brazil",
            2
        )
        questionsList.add(ques6)

        val ques7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "New Zealand",
            "Denmark",
            "Germany",
            3
        )
        questionsList.add(ques7)

        val ques8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Belgium",
            "Germany",
            1
        )
        questionsList.add(ques8)

        val ques9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Denmark",
            "Belgium",
            "Kuwait",
            3
        )
        questionsList.add(ques9)

        val ques10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Argentina",
            "Fiji",
            1
        )
        questionsList.add(ques10)
        return questionsList
    }
}