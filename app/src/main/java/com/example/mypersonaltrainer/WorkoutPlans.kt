package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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

            val myFragment = workoutPlansContent()

            val manager = supportFragmentManager

            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,myFragment)
            transaction.commit()

//            visable_fragment.setVisibility((View.VISIBLE))


        }


    }
}