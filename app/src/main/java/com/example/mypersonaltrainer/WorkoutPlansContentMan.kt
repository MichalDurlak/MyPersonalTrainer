package com.example.mypersonaltrainer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_workout_plans_content_man.view.*


class WorkoutPlansContentMan : Fragment() {

    lateinit var mView:View


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mView = inflater.inflate(R.layout.fragment_workout_plans_content_man, container, false)

        val randomNumber = (1..10).random()

        val planManOne : String = "Chest – Barbell Bench Press – 4 sets of 8 reps\n\n" +
                "Back – Lat-pulldowns – 4 sets of 10 reps\n\n" +
                "Shoulders – Seated Dumbbell Press – 4 sets of 10 reps\n\n" +
                "Legs – Leg Extensions – 4 sets of 10 reps\n\n" +
                "Biceps – Barbell Bbicep Curls – 3 sets of 10 reps\n\n" +
                "Triceps – Triceps Rope Pushdowns – 3 sets of 15 reps\n\n"

        val planManTwo : String = "Legs – Leg Press Machine – 4 sets of 8 reps\n\n" +
                "Triceps – Overhead Bar Extensions – 3 sets of 20 reps\n\n" +
                "Biceps – EZ Bar Curls – 4 sets of 10 reps\n\n" +
                "Chest – Machine Chest Press – 4 sets of 10 reps\n\n" +
                "Back – T-Bar Row – 4 sets of 10 reps\n\n" +
                "Shoulders – Lateral Raises – 3 sets of 20 reps\n\n"

        val planManThree : String = "Shoulders – EZ Bar Upright Rows – 3 sets of 15 reps\n\n" +
                "Back – Close-Grip Pulldowns – 4 sets of 12 reps\n\n" +
                "Chest – Cable Fly – 4 sets of 10 reps\n\n" +
                "Legs – Lunges – 3 sets of 10 reps per leg\n\n" +
                "Triceps – Skullcrushers – 3 sets of 15 reps\n\n" +
                "Biceps – Hammer Curls – 3 sets of 12 reps\n\n"

        val planManFour : String = "Dumbbell Bench Press – 3 sets of 10, 10, 8 (adding weight) reps\n\n" +
                "Incline Dumbbell Bench Press – 3 sets of 10 reps\n\n" +
                "Chest Dip – 3 sets of MAX reps\n\n" +
                "Skullcrushers – 3 sets of 8-10 Reps\n\n" +
                "One Arm Dumbbell Extension – 3 sets of 10 reps\n\n" +
                "Tricep Extension – 3 sets of 10 reps\n\n" +
                "Barbell Front Raise – 4 sets of 12 reps\n\n" +
                "Dumbbell Lateral Raise – 4 sets of 15, 12, 8, 8 (adding weight) reps\n\n"

        val planManFive : String = "Wide Grip Pull Up 3 sets of MAX reps\n\n" +
                "Lat Pull Down – 3 sets of 10 reps\n\n" +
                "Straight Arm Lat Pull Down – 3 sets of 10 reps\n\n" +
                "Machine Reverse Fly – 3 sets of 10 reps\n\n" +
                "Upright Row – 3 sets of 8-10 reps\n\n" +
                "Standing Barbell Curl – 3 sets of 8-10 reps\n\n" +
                "Preacher Curl – 3 sets of 10 reps\n\n" +
                "Incline Dumbbell Curl – 3 sets of 10 reps\n\n"

        val planManSix : String = "Squat – 4 sets of 10,10,8,8 reps\n\n" +
                "Dumbbell Lunge – 3 sets of 8 on each leg\n\n" +
                "45 Degree Leg Press – 3 sets of 12 reps\n\n" +
                "Leg Curl – 3 sets of 15 reps\n\n" +
                "Leg Extension – 3 sets of 15 reps\n\n" +
                "Standing Calf Raise – 5 sets of 10,8,8,8,6 (heavy)reps\n\n" +
                "Seated Calf Raise – 5 sets of 15 (light) reps\n\n"

        val planManSeven : String ="Barbell Bench Press – 3 sets of 10, 10, 8 reps\n\n" +
                "Dumbbell Flys – 3 sets of 10 reps\n\n" +
                "Cable Crossovers – 3 sets of 10 reps\n\n" +
                "Close Grip Bench Press – 4 sets of 10, 10, 8, 6 reps\n\n" +
                "Lying Dumbbell Extension – 3 sets of 10 reps\n\n" +
                "Tricep Kickback – 3 sets of 10 reps\n\n" +
                "Seated Dumbbell Press – 4 sets of 10, 10, 8, 8 reps\n\n" +
                "One Arm Cable Lateral Raise – 3 sets of 12 reps\n\n"

        val planManEight : String ="Seated Row – 4 sets of 10 reps\n\n" +
                "Bent Over Barbell Row – 3 sets of 10 reps\n\n" +
                "Bent Over Row – 3 sets of 12 reps\n\n" +
                "Smith Machine Upright Row – 3 sets of 8-10 reps\n\n" +
                "Cable Curl – 4 sets of 8-10 reps\n\n" +
                "Concentration Curl – 3 sets of 10 reps\n\n" +
                "Reverse Barbell Curl – 3 sets of 10 reps\n\n"

        val planManNine : String ="Barbell Bench Press – work up to a 5 rep max for the day\n\n" +
                "Set 1 at 50% – 1 set of 5 reps\n\n" +
                "Set 2 at 60% – 1 set of 5 reps\n\n" +
                "Set 3 at 70% – 1 set of 5 reps\n\n" +
                "Set 4 at 80% – 1 set of 5 reps\n\n" +
                "Set 5 at 90% – 1 set of 5 reps\n\n" +
                "Set 6 at 100% – 1 set of 5 reps\n\n" +
                "Incline Dumbbell Press – 3 sets of 6-8 reps\n\n" +
                "Dips – 3 sets of 6-10 reps\n\n" +
                "Pullups – 3 sets of 5-8 reps\n\n" +
                "Pendlay Rows – 3 sets of 6-10 reps\n\n" +
                "Pulldowns – 3 sets of 6-10 reps\n\n"

        val planManTen : String ="Squats: work up to a 5 rep max for the day\n\n" +
                "Set 1 at 50% – 1 set of 5 reps\n\n" +
                "Set 2 at 60% – 1 set of 5 reps\n\n" +
                "Set 3 at 70% – 1 set of 5 reps\n\n" +
                "Set 4 at 80% – 1 set of 5 reps\n\n" +
                "Set 5 at 90% – 1 set of 5 reps\n\n" +
                "Set 6 at 100% – 1 set of 5 reps\n\n" +
                "Leg Press – 3 sets of 6-10 reps\n\n" +
                "Stiff-Legged Deadlift – 5 sets of 5 reps\n\n" +
                "Hamstring Curls – 3 sets of 6-8 reps\n\n" +
                "Calf-Raise – 5 sets of 10 reps\n\n"





        if (randomNumber == 1 ){
            mView.txt_plan.text = planManOne
        } else if (randomNumber == 2){
            mView.txt_plan.text =  planManTwo
        } else if (randomNumber == 3){
            mView.txt_plan.text =  planManThree
        } else if (randomNumber == 4){
            mView.txt_plan.text =  planManFour
        } else if (randomNumber == 5){
            mView.txt_plan.text =  planManFive
        } else if (randomNumber == 6){
            mView.txt_plan.text =  planManSix
        } else if (randomNumber == 7){
            mView.txt_plan.text =  planManSeven
        } else if (randomNumber == 8){
            mView.txt_plan.text =  planManEight
        } else if (randomNumber == 9){
            mView.txt_plan.text =  planManNine
        } else if (randomNumber == 10){
            mView.txt_plan.text =  planManTen
        } else {
            mView.txt_plan.text = "Problem with downloading workout plan"
        }

        return mView

    }



}