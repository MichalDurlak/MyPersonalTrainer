package com.example.mypersonaltrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.wsbzajecia2.UserDB
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_user_challenges.*

var getpointbuttontaskone : Int = 1


class UserChallenges : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_challenges)








        var userName : String = "null"

        userName = intent.getStringExtra("nameLogin_key").toString()


//        val txt_PointsUserTextView: TextView = findViewById(R.id.txt_PointsUser)
//        txt_PointsUserTextView.text = userPoint.toString().capitalize()

        val userDB: UserDB = UserDB(this)
        val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
        txt_PointsUser.text = pointuser.sum().toString()




        btn_return.setOnClickListener(){

            val intent = Intent(this@UserChallenges, HomePageActivity::class.java)
            intent.putExtra("nameLoginback_key", userName)
            startActivity(intent)

        }


/* task 1 */
        btn_taskOne.setOnClickListener(){

            if (getpointbuttontaskone == 1){
                val userDB: UserDB = UserDB(this)

                val taskPoints = 100
                val tempUserPoint = userDB.checkPointUser(userName).map{it.toInt()}
                val userPointsAtTheMoment = tempUserPoint.sum()
                val taskUpdatePoints = userPointsAtTheMoment+taskPoints


                if (userDB.updatePoints(userName,taskUpdatePoints) == true){

                    Toast.makeText(applicationContext, "Points updated", Toast.LENGTH_LONG).show()

                    getpointbuttontaskone = 0
                    btn_taskOne.isClickable = false


                }
            }else {
                Toast.makeText(applicationContext, "You got the points", Toast.LENGTH_LONG).show()
                btn_taskOne.isClickable = false
            }


            val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
            txt_PointsUser.text = pointuser.sum().toString()

        }

/* task 2 */
        btn_taskTwo.setOnClickListener(){


            val userDB: UserDB = UserDB(this)

            val taskPoints = 50
            val tempUserPoint = userDB.checkPointUser(userName).map { it.toInt() }
            val userPointsAtTheMoment = tempUserPoint.sum()
            val taskUpdatePoints = userPointsAtTheMoment + taskPoints
            if (userDB.updatePoints(userName,taskUpdatePoints) == true){

                Toast.makeText(applicationContext, "Points updated", Toast.LENGTH_LONG).show()


                val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
                txt_PointsUser.text = pointuser.sum().toString()


            }



        }

/* task 3 */
        btn_taskThree.setOnClickListener(){


            val userDB: UserDB = UserDB(this)

            val taskPoints = 500
            val tempUserPoint = userDB.checkPointUser(userName).map { it.toInt() }
            val userPointsAtTheMoment = tempUserPoint.sum()
            val taskUpdatePoints = userPointsAtTheMoment + taskPoints

            if (userDB.updatePoints(userName,taskUpdatePoints) == true){

                Toast.makeText(applicationContext, "Points updated", Toast.LENGTH_LONG).show()


                val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
                txt_PointsUser.text = pointuser.sum().toString()


            }


        }

/* task 4 */
        btn_taskFour.setOnClickListener(){


            val userDB: UserDB = UserDB(this)

            val taskPoints = 1000
            val tempUserPoint = userDB.checkPointUser(userName).map { it.toInt() }
            val userPointsAtTheMoment = tempUserPoint.sum()
            val taskUpdatePoints = userPointsAtTheMoment + taskPoints

            if (userDB.updatePoints(userName,taskUpdatePoints) == true){

                Toast.makeText(applicationContext, "Points updated", Toast.LENGTH_LONG).show()



                val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
                txt_PointsUser.text = pointuser.sum().toString()

            }


        }

/* task 5 */
        btn_taskFive.setOnClickListener(){


                val userDB: UserDB = UserDB(this)

                val taskPoints = 25
                val tempUserPoint = userDB.checkPointUser(userName).map { it.toInt() }
                val userPointsAtTheMoment = tempUserPoint.sum()
                val taskUpdatePoints = userPointsAtTheMoment + taskPoints

            if (userDB.updatePoints(userName,taskUpdatePoints) == true){

                Toast.makeText(applicationContext, "Points updated", Toast.LENGTH_LONG).show()


                val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
                txt_PointsUser.text = pointuser.sum().toString()


            }


        }

/* task 6 */
        btn_taskSix.setOnClickListener(){


                val userDB: UserDB = UserDB(this)

                val taskPoints = 123
                val tempUserPoint = userDB.checkPointUser(userName).map { it.toInt() }
                val userPointsAtTheMoment = tempUserPoint.sum()
                val taskUpdatePoints = userPointsAtTheMoment + taskPoints

            if (userDB.updatePoints(userName,taskUpdatePoints) == true){

                Toast.makeText(applicationContext, "Points updated", Toast.LENGTH_LONG).show()


                val pointuser = userDB.checkPointUser(userName).map{it.toInt()}
                txt_PointsUser.text = pointuser.sum().toString()


            }

            }




    }
}