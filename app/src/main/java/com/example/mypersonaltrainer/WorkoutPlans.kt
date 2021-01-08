package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.wsbzajecia2.UserDB

import kotlinx.android.synthetic.main.activity_my_profile.*
import kotlinx.android.synthetic.main.activity_user_challenges.*
import kotlinx.android.synthetic.main.activity_user_challenges.btn_return
import kotlinx.android.synthetic.main.activity_workout_plans.*
import kotlinx.android.synthetic.main.activity_workout_plans.btn_Return

class WorkoutPlans : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_plans)

        var userName : String = "null"

        userName = intent.getStringExtra("nameLoginWorkout_key").toString()




        btn_Return.setOnClickListener(){

            val intent = Intent(this@WorkoutPlans, HomePageActivity::class.java)
            intent.putExtra("nameLoginWorkoutback_key", userName)
            startActivity(intent)

        }

        btn_randomWorkoutPlan.setOnClickListener(){

            val userDB: UserDB = UserDB(this)
            val WomanOrMan = userDB.checkWomanOrMan(userName).joinToString()


            if (WomanOrMan.equals("Woman")){
                val myFragment = WorkoutPlansContentwoman()

                val manager = supportFragmentManager

                val transaction = manager.beginTransaction()
                transaction.replace(R.id.fragmentContainer,myFragment)
                transaction.commit()

            } else if (WomanOrMan.equals("Man")){
                val myFragment = WorkoutPlansContentMan()

                val manager = supportFragmentManager

                val transaction = manager.beginTransaction()
                transaction.replace(R.id.fragmentContainer,myFragment)
                transaction.commit()
            } else {

            }



//            visable_fragment.setVisibility((View.VISIBLE))


        }


    }
}