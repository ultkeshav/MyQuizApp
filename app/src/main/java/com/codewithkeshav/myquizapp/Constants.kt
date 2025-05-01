package com.codewithkeshav.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1,"What country does this flag belong to?",
            R.drawable.india,
            "India","Iran",
            "Israel","Italy",
            1
        )
        questionList.add(que1)

        val que2 = Questions(
            2,"What country does this flag belong to?",
            R.drawable.brazil,
            "Boston","Belgium",
            "Brazil","Croatia",
            3
        )
        questionList.add(que2)
        val que3 = Questions(
            3,"What country does this flag belong to?",
            R.drawable.usa,
            "England","USA",
            "Finland","Scotland",
            2
        )
        questionList.add(que3)
        val que4 = Questions(
            4,"What country does this flag belong to?",
            R.drawable.pak,
            "Pakistan","PKMKB",
            "BETA","CHINA",
            1
        )
        questionList.add(que4)
        val que5 = Questions(
            5,"What country does this flag belong to?",
            R.drawable.germany,
            "Scotland","Egypt",
            "Saudi Arabia","Germany",
            4
        )
        questionList.add(que5)
        val que6 = Questions(
            6,"What country does this flag belong to?",
            R.drawable.jap,
            "Bhutan","Japan",
            "Nepal","Finland",
            1
        )
        questionList.add(que6)

        val que7 = Questions(
                7,"What country does this flag belong to?",
        R.drawable.china,
        "NewZealand","England",
        "China","India",
        3
        )
        questionList.add(que7)

        val que8 = Questions(
            8,"What country does this flag belong to?",
            R.drawable.saudi,
            "Kuwait","Dubai",
            "Saudi","Palestine",
            3
        )
        questionList.add(que8)

        val que9 = Questions(
            9,"What country does this flag belong to?",
            R.drawable.singapore1,
            "Singapore","Hong Kong",
            "Switzerland","Thailand",
            3
        )
        questionList.add(que9)



        return  questionList
    }
}