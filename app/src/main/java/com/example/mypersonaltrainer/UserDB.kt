package com.example.wsbzajecia2

import android.content.ContentValues
import android.content.Context
import android.database.Cursor

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build.USER
import com.example.mypersonaltrainer.UserModel


class UserDB(context : Context) :
        SQLiteOpenHelper(context, DB_NAME,null, DB_VERSION) {

    companion object {
        private const val DB_VERSION = 1
        private const val DB_NAME = "UserDatabase.db"
        private const val TABLE_USERS = "UserTable"

        private const val KEY_ID = "_id"
        private const val KEY_NAME = "name"
        private const val KEY_PASSWORD = "password"
        private const val KEY_EMAIL = "email"
        private const val KEY_AGE = "age"
        private const val KEY_WEIGHT = "weight"

    }

    override fun onCreate(db: SQLiteDatabase?) {

        val CREATE_TABLE_USERS = ("CREATE TABLE " + TABLE_USERS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_PASSWORD + " TEXT," + KEY_EMAIL + " TEXT,"
                + KEY_AGE + " TEXT," + KEY_WEIGHT + " TEXT" + ")")
        db?.execSQL(CREATE_TABLE_USERS)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS)
        onCreate(db)
    }


    // WRITE TO DATABASE
    fun addUser(emp: UserModel): Long{

        val db = this.writableDatabase

        val contentValues = ContentValues()


        contentValues.put(KEY_NAME, emp.uname)
        contentValues.put(KEY_PASSWORD, emp.upassword)
        contentValues.put(KEY_EMAIL, emp.uemail)
        contentValues.put(KEY_AGE, emp.uage)
        contentValues.put(KEY_WEIGHT, emp.uweight)

        val success = db.insert(TABLE_USERS,null,contentValues)

        db.close()
        return success
    }

    // READ FROM DATABASE
    fun selectAllUser(): ArrayList<UserModel>{

        val usersList: ArrayList<UserModel> = ArrayList<UserModel>()

        val selectQuery = "SELECT * FROM $TABLE_USERS"

        val db = this.readableDatabase
        var cursor: Cursor? = null

        try {
            cursor = db.rawQuery(selectQuery, null)



        } catch (e: SQLiteException){
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var uid: Int
        var uname: String
        var upassword: String
        var uemail: String
        var uage: String
        var uweight: String

        if (cursor.moveToFirst()){
            do {
                uid = cursor.getInt(cursor.getColumnIndex(KEY_ID))
                uname = cursor.getString(cursor.getColumnIndex(KEY_NAME))
                upassword = cursor.getString(cursor.getColumnIndex(KEY_PASSWORD))
                uemail = cursor.getString(cursor.getColumnIndex(KEY_EMAIL))
                uage = cursor.getString(cursor.getColumnIndex(KEY_AGE))
                uweight = cursor.getString(cursor.getColumnIndex(KEY_WEIGHT))

                val user = UserModel(uid = uid, uname = uname, upassword = upassword, uemail = uemail, uage=uage, uweight = uweight)
                usersList.add(user)

            } while (cursor.moveToNext())

        }

        return usersList

    }




    fun updateUserWith(emp: UserModel): Int {

        val db = this.writableDatabase
        val contentValues = ContentValues()

        contentValues.put(KEY_ID, emp.uid)
        contentValues.put(KEY_NAME, emp.uname)

        contentValues.put(KEY_PASSWORD, emp.upassword)
        contentValues.put(KEY_EMAIL, emp.uemail)
        contentValues.put(KEY_AGE, emp.uage)
        contentValues.put(KEY_WEIGHT, emp.uweight)

        val success = db.update(TABLE_USERS, contentValues, KEY_ID + "=" + emp.uid, null)

        db.close()
        return success

    }

    fun deleteUserWith(emp: UserModel): Int {

        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_ID, emp.uid)

        val success = db.delete(TABLE_USERS, KEY_ID + "=" + emp.uid, null)

        db.close()
        return success

    }



}