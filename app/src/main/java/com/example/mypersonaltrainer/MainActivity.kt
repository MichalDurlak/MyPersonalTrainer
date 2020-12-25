package com.example.mypersonaltrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        /* Hide status bar */
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main)

        btn_LogIn.setOnClickListener(){

            if (TextUtils.isEmpty(input_Login.text.toString()) || TextUtils.isEmpty(input_Password.text.toString())){
                Toast.makeText(applicationContext, "First type your login and password", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(applicationContext, "Checking login and password", Toast.LENGTH_LONG).show()
            }
        }

    btn_Register.setOnClickListener(){
setContentView(R.layout.activity_register)
    }

    }


}