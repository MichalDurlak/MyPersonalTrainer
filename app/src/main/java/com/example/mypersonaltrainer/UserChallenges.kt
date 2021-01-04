package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.wsbzajecia2.UserDB
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_user_challenges.*

class UserChallenges : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_challenges)

        var userName : String = "null"

        userName = intent.getStringExtra("nameLogin_key").toString()


//        val txt_PointsUserTextView: TextView = findViewById(R.id.txt_PointsUser)
//        txt_PointsUserTextView.text = userPoint.toString().capitalize()

        val userDB: UserDB = UserDB(this)
        txt_PointsUser.text = userDB.checkPointUser(userName).toString()




        btn_return.setOnClickListener(){

            val intent = Intent(this@UserChallenges, HomePageActivity::class.java)
            intent.putExtra("nameLoginback_key", userName)
            startActivity(intent)

        }



        btn_taskOne.setOnClickListener(){
            val userDB: UserDB = UserDB(this)
            val test = userDB.searchForID("test")
            Toast.makeText(applicationContext, "Test test " + test, Toast.LENGTH_LONG).show()


        }


    }
}