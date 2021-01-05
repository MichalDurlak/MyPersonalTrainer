package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_profile.*
import kotlinx.android.synthetic.main.activity_workout_plans.*

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)


        var userName : String = "null"

        userName = intent.getStringExtra("nameLoginMyProfile_key").toString()




        btn_ReturnMyProfile.setOnClickListener(){

            val intent = Intent(this@MyProfile, HomePageActivity::class.java)
            intent.putExtra("nameLoginMyProfileback_key", userName)
            startActivity(intent)

        }


    }
}