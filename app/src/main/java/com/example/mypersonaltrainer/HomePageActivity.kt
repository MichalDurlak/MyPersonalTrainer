package com.example.mypersonaltrainer

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

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


        btn_Logout.setOnClickListener(){
            val intent: Intent = Intent(applicationContext,MainActivity::class.java)

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