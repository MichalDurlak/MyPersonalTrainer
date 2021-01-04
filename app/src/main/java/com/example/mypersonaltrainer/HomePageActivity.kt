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


        val nameToWelcome = intent.getStringExtra("nameToWelcome_key")
        val tempnameToWelcome = intent.getStringExtra("nameLoginback_key")

//        val nameToWelcomeTextView: TextView = findViewById(R.id.txt_NameFromDatabase)
//        nameToWelcomeTextView.text = nameToWelcome.toString().capitalize()

        if (nameToWelcome.equals("null")){
            txt_NameFromDatabase.text = tempnameToWelcome.toString().capitalize()
        } else {
            txt_NameFromDatabase.text = nameToWelcome.toString().capitalize()
        }



        val userDB: UserDB = UserDB(this)
        txt_Points2.text = userDB.checkPointUser(nameToWelcome.toString()).toString()







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
            val nameLogin = nameToWelcome.toString()
            intent.putExtra("nameLogin_key", nameLogin)
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