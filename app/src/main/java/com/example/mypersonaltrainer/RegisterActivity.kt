package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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








        btn_RegisterRegister.setOnClickListener {
            view ->

            addRecord(view)

        }

        btn_RegisterCancel.setOnClickListener(){

            val intent: Intent = Intent(applicationContext,MainActivity::class.java)

            startActivity(intent)

        }

    }



    fun addRecord(view: View){
        val uname = input_RegisterLogin.text.toString()
        val upassword = input_RegisterPassword.text.toString()
        val uemail = input_RegisterEmail.text.toString()
        val uage = input_RegisterAge.text.toString()
        val uweight = input_RegisterWeight.text.toString()



        val userDB: UserDB = UserDB(this)

        if (!uname.isEmpty() && !upassword.isEmpty() && !uemail.isEmpty() && !uage.isNullOrEmpty() && !uweight.isNullOrEmpty()){
            val status =
                    userDB.addUser(UserModel(0,uname,upassword,uemail,uage,uweight))


            if (status > -1){
                Toast.makeText(applicationContext, "User has been saved",Toast.LENGTH_LONG).show()
                input_RegisterLogin.text.clear()
                input_RegisterPassword.text.clear()
                input_RegisterAgainPassword.text.clear()
                input_RegisterEmail.text.clear()
                input_RegisterAge.text.clear()
                input_RegisterWeight.text.clear()

                val intent: Intent = Intent(applicationContext,MainActivity::class.java)

                startActivity(intent)

            }




        } else {
            Toast.makeText(applicationContext, "Cant create an account, because there are empty forms",Toast.LENGTH_LONG).show()

        }
    }

}