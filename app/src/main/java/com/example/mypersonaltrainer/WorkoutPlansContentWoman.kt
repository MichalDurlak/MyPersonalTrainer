package com.example.mypersonaltrainer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_workout_plans_content_woman.view.*


class WorkoutPlansContentwoman : Fragment(){


    lateinit var mView:View


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mView = inflater.inflate(R.layout.fragment_workout_plans_content_woman, container, false)

        val randomNumber = (1..6).random()

        val planWomanOne : String = "10 burpees\n\n" +
                "10 push ups\n\n" +
                "15 crunches\n\n" +
                "20 squat thrusts\n\n" +
                "3 sets of 10 hanging leg raises\n\n" +
                "3 x 1-minute rounds of plank\n\n" +
                "20 minutes low intensity cardio on the treadmill\n\n"

        val planWomanTwo : String = "Incline dumbbell press – 5 sets of 5 reps\n\n" +
                "Flat bench barbell press – 5 sets of 5 reps\n\n" +
                "Deadlifts – 5 sets of 5 reps\n\n" +
                "Barbell clean and press – 5 sets of 5 reps\n\n" +
                "Barbell bent-over rows – 5 sets of 5 reps\n\n" +
                "Barbell snatch – 5 sets of 5 reps\n\n" +
                "10 minutes on the stationary bike\n\n"

        val planWomanThree : String = "Barbell squats – 4 sets of 8 reps\n\n" +
                "Leg press machine – 3 sets of 12 reps\n\n" +
                "Leg extensions – 3 sets of 15 reps\n\n" +
                "Hamstring curls – 3 sets of 15 reps\n\n" +
                "Walking lunges – 4 sets of 10 reps per leg\n\n" +
                "Seated or standing calf raises – 4 sets of 20 reps per leg\n\n" +
                "10 minutes on the elliptical machine"
        val planWomanFour : String = "Standing barbell military press – 4 sets of 10 reps\n\n" +
                "Dumbbell lateral raises – 4 sets of 15 reps\n\n" +
                "EZ bar upright rows – 3 sets of 15 reps\n\n" +
                "Seated dumbbell shoulder press – 4 sets of 10 reps\n\n" +
                "Dumbbell shrugs – 4 sets of 10 reps\n\n" +
                "Close-grip lat pulldowns – 4 sets of 12 reps\n\n" +
                "Dumbbell bent over rows – 4 sets of 12 reps per arm\n\n" +
                "T-Bar rows – 4 sets of 10 reps\n\n" +
                "10 minutes on the stationary bike\n\n"

        val planWomanFive : String = "Flat bench barbell press – 4 sets of 8 reps\n\n" +
                "Push ups – 4 sets of 10 reps\n\n" +
                "Cable crossovers – 3 sets of 15 reps\n\n" +
                "Incline dumbbell flyes – 4 sets of 12 reps\n\n" +
                "Barbell biceps curls – 3 sets of 15 reps\n\n" +
                "Alternate arm hammer curls – 4 sets of 12 reps per arm\n\n" +
                "Triceps rope overhead extensions – 3 sets of 20 reps\n\n" +
                "Triceps dips – 3 sets of 15 reps\n\n" +
                "10 minutes on the elliptical machine\n\n"

        val planWomanSix : String = "1 minute of knee lifts\n\n" +
                "1 minute of heel digs\n\n" +
                "2 sets of 10 shoulder rolls per arm\n\n" +
                "10 knee bends\n\n" +
                "20 head rotations\n\n" +
                "10 hip rotations\n"



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
