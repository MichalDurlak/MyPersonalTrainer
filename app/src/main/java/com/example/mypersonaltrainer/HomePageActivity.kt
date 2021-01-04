package com.example.mypersonaltrainer

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import com.example.wsbzajecia2.UserDB

import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var userName : String = "null"

        if (userName.equals("null")){
            userName = intent.getStringExtra("nameToWelcome_key").toString()

            if (userName.equals("null")){
                userName = intent.getStringExtra("nameLoginback_key").toString()
            }

        } else {
            return

        }

//        if (userName.equals("null")){
//            userName = intent.getStringExtra("nameToWelcome_key").toString()
//
//        }


        txt_NameFromDatabase.text = userName.capitalize()




//        val nameToWelcomeTextView: TextView = findViewById(R.id.txt_NameFromDatabase)
//        nameToWelcomeTextView.text = nameToWelcome.toString().capitalize()




        val userDB: UserDB = UserDB(this)
        txt_Points2.text = userDB.checkPointUser(userName.toString()).toString()







        isUsingNightModeResources()
        if (isUsingNightModeResources() == true){
            btn_DayHomePage.setVisibility(View.VISIBLE)
            btn_NightHomePage.setVisibility(View.GONE)
        } else {
            btn_NightHomePage.setVisibility(View.VISIBLE)
            btn_DayHomePage.setVisibility(View.GONE)
        }


        btn_NightHomePage.setOnClickListener(){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            btn_NightHomePage.setVisibility(View.GONE)
            btn_DayHomePage.setVisibility(View.VISIBLE)

        }

        btn_DayHomePage.setOnClickListener(){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            btn_NightHomePage.setVisibility(View.VISIBLE)
            btn_DayHomePage.setVisibility(View.GONE)
        }

        img_Exit.setOnClickListener(){
            moveTaskToBack(true);
            exitProcess(-1)
        }


        img_challanges.setOnClickListener(){
            val intent = Intent(this@HomePageActivity, UserChallenges::class.java)
            intent.putExtra("nameLogin_key", userName)
            startActivity(intent)


        }



    }

    private fun isUsingNightModeResources(): Boolean {
        return when (resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK) {
            Configuration.UI_MODE_NIGHT_YES -> true
            Configuration.UI_MODE_NIGHT_NO -> false
            Configuration.UI_MODE_NIGHT_UNDEFINED -> false
            else -> false
        }
    }






}