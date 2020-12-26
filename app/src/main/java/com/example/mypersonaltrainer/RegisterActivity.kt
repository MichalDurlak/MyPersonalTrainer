package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import com.example.wsbzajecia2.UserDB
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_Register
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        /* Hide status bar */
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        /*  Var for users */

        // val uid = null
        val uname = input_RegisterLogin.text
//        val usurname = input_Register.text
        val upassword = input_RegisterPassword.text
        val uemail = input_RegisterEmail.text
        val uage = input_RegisterAge.text
        val uweight = input_RegisterWeight.text





        val db = UserDB(this)
//        db.insertIntoUser()

//"NAME = $uname \n PASSWORD = $upassword \n EMAIL = $uemail \n AGE = $uage \n WEIGHT = $uweight \n"

        btn_RegisterRegister.setOnClickListener(){

            Toast.makeText(applicationContext, "NAME = $uname \n PASSWORD = $upassword \n EMAIL = $uemail \n AGE = $uage \n WEIGHT = $uweight \n ", Toast.LENGTH_LONG).show()

        }

        btn_RegisterCancel.setOnClickListener(){

            val intent: Intent = Intent(applicationContext,MainActivity::class.java)

            startActivity(intent)

        }

    }
}