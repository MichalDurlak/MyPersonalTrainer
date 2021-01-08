package com.example.mypersonaltrainer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_workout_plans_content.*
import kotlinx.android.synthetic.main.fragment_workout_plans_content.view.*


class workoutPlansContent : Fragment() {

    lateinit var mView:View


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mView = inflater.inflate(R.layout.fragment_workout_plans_content, container, false)

        val randomNumber = (1..6).random()



        val planWomanOne : String = "10 burpees\n" +
                "10 push ups\n" +
                "15 crunches\n" +
                "20 squat thrusts\n" +
                "3 sets of 10 hanging leg raises\n" +
                "3 x 1-minute rounds of plank\n" +
                "20 minutes low intensity cardio on the treadmill\n"

        val planWomanTwo : String = "Incline dumbbell press – 5 sets of 5 reps\n" +
                "Flat bench barbell press – 5 sets of 5 reps\n" +
                "Deadlifts – 5 sets of 5 reps\n" +
                "Barbell clean and press – 5 sets of 5 reps\n" +
                "Barbell bent-over rows – 5 sets of 5 reps\n" +
                "Barbell snatch – 5 sets of 5 reps\n" +
                "10 minutes on the stationary bike"

        val planWomanThree : String = "Barbell squats – 4 sets of 8 reps\n" +
                "Leg press machine – 3 sets of 12 reps\n" +
                "Leg extensions – 3 sets of 15 reps\n" +
                "Hamstring curls – 3 sets of 15 reps\n" +
                "Walking lunges – 4 sets of 10 reps per leg\n" +
                "Seated or standing calf raises – 4 sets of 20 reps per leg\n" +
                "10 minutes on the elliptical machine"
        val planWomanFour : String = "Standing barbell military press – 4 sets of 10 reps\n" +
                "Dumbbell lateral raises – 4 sets of 15 reps\n" +
                "EZ bar upright rows – 3 sets of 15 reps\n" +
                "Seated dumbbell shoulder press – 4 sets of 10 reps\n" +
                "Dumbbell shrugs – 4 sets of 10 reps\n" +
                "Close-grip lat pulldowns – 4 sets of 12 reps\n" +
                "Dumbbell bent over rows – 4 sets of 12 reps per arm\n" +
                "T-Bar rows – 4 sets of 10 reps\n" +
                "10 minutes on the stationary bike"

        val planWomanFive : String = "Flat bench barbell press – 4 sets of 8 reps\n" +
                "Push ups – 4 sets of 10 reps\n" +
                "Cable crossovers – 3 sets of 15 reps\n" +
                "Incline dumbbell flyes – 4 sets of 12 reps\n" +
                "Barbell biceps curls – 3 sets of 15 reps\n" +
                "Alternate arm hammer curls – 4 sets of 12 reps per arm\n" +
                "Triceps rope overhead extensions – 3 sets of 20 reps\n" +
                "Triceps dips – 3 sets of 15 reps\n" +
                "10 minutes on the elliptical machine"

        val planWomanSix : String = "1 minute of knee lifts\n" +
                "1 minute of heel digs\n" +
                "2 sets of 10 shoulder rolls per arm\n" +
                "10 knee bends\n" +
                "20 head rotations\n" +
                "10 hip rotations"



        if (randomNumber == 1 ){
            mView.txt_plan.text = planWomanOne
        } else if (randomNumber == 2){
            mView.txt_plan.text =  planWomanTwo
        } else if (randomNumber == 3){
            mView.txt_plan.text =  planWomanThree
        } else if (randomNumber == 4){
            mView.txt_plan.text =  planWomanFour
        } else if (randomNumber == 5){
            mView.txt_plan.text =  planWomanFive
        } else if (randomNumber == 6){
            mView.txt_plan.text =  planWomanSix
        } else {
            mView.txt_plan.text = "Problem z pobraniem planu"
        }

        return mView
    }





}