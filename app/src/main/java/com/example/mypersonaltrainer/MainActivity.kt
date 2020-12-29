package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import com.example.wsbzajecia2.UserDB
import com.google.android.material.snackbar.Snackbar
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

                val loginInputTry : String = input_Login.text.toString()
                val passwordInputTry : String = input_Password.text.toString()

                val userDB: UserDB = UserDB(this)

                val trueORfalseLogin = userDB.checkUser(loginInputTry,passwordInputTry)

                if (trueORfalseLogin == true){
                    val intent: Intent = Intent(applicationContext,HomePageActivity::class.java)

                    startActivity(intent)


                } else {

                    Toast.makeText(applicationContext, "Something went wrong, check login and password", Toast.LENGTH_LONG).show()

                    input_Login.text.clear()
                    input_Password.text.clear()


                }







            }
        }

    btn_Register.setOnClickListener(){

        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)

    }






    }







    }


