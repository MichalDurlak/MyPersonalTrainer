package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.wsbzajecia2.UserDB
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_user_challenges.*

class UserChallenges : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_challenges)


        val userPoint = intent.getStringExtra("nameLogin_key")


//        val txt_PointsUserTextView: TextView = findViewById(R.id.txt_PointsUser)
//        txt_PointsUserTextView.text = userPoint.toString().capitalize()

        val userDB: UserDB = UserDB(this)
        txt_PointsUser.text = userDB.checkPointUser(userPoint.toString()).toString()




        btn_return.setOnClickListener(){

            val intent = Intent(this@UserChallenges, HomePageActivity::class.java)
            val nameToWelcome = input_Login.text.toString()
            intent.putExtra("nameLoginback_key", nameToWelcome)
            startActivity(intent)

        }


    }
}