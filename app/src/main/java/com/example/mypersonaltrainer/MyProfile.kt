package com.example.mypersonaltrainer

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wsbzajecia2.UserDB
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_my_profile.*
import kotlinx.android.synthetic.main.activity_workout_plans.*

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        var userName : String = "null"
        userName = intent.getStringExtra("nameLoginMyProfile_key").toString()

        val userDB: UserDB = UserDB(this)
        val manOrWoman = userDB.checkWomanOrMan(userName)
        var manOrWomanString : String = ""
        manOrWomanString = manOrWoman.joinToString()

        if (manOrWomanString == "Man"){
            img_avatarman.setVisibility(View.VISIBLE)
            img_avatarwoman.setVisibility(View.GONE)
        } else if (manOrWomanString == "Woman"){
            img_avatarwoman.setVisibility(View.VISIBLE)
            img_avatarman.setVisibility(View.GONE)
        } else {
            img_avatarman.setVisibility(View.GONE)
            img_avatarwoman.setVisibility(View.GONE)
        }


        txt_NameUser.text = userName
        var addressemailuser = userDB.checkAddressEmail(userName)
        txt_addressemailuser.text = addressemailuser.joinToString()

        val ageuser = userDB.checkAge(userName).map{it.toInt()}
        txt_ageuser.text = ageuser.sum().toString()

        val weightuser = userDB.checkWeight(userName).map{it.toInt()}
        id_weightuser.text = weightuser.sum().toString()

        txt_sexuser.text = manOrWomanString

        val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
        id_pointsuser.text = pointuser.sum().toString()


        /* LOGO DOWNLOADED FROM
"Icon made by Pixel perfect from www.flaticon.com"
https://www.flaticon.com/free-icon/fitness_177660
https://www.flaticon.com/free-icon/fitness_177687#
        */
        btn_ReturnMyProfile.setOnClickListener(){



            val intent = Intent(this@MyProfile, HomePageActivity::class.java)
            intent.putExtra("nameLoginMyProfileback_key", userName)
            startActivity(intent)

        }


    }
}