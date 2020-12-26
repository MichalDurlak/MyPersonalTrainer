package com.example.wsbzajecia2

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build.USER
import com.example.mypersonaltrainer.UserModel


class UserDB(context : Context) : SQLiteOpenHelper(context,"userdb.db",null,DB_VERSION) {

    var context : Context? = null
    init {
        this.context = context
    }


    companion object{
        val DB_VERSION = 1
        val CREATE_TABLE_USER = "CREATE TABLE user(uid INT, uname TEXT, usurname TEXT, upassword TEXT, uemail TEXT, uage INT, uweight DOUBLE)"
        val SELECT_USER = "SELECT * FROM user"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(CREATE_TABLE_USER)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun insertIntoUser(uid:Int, uname:String, usurname:String, upassword:String, uemail:String, uage:String, uweight:Double):Boolean{
        var contentValues = ContentValues()
        contentValues.put("uid",uid)
        contentValues.put("uname",uname)
        contentValues.put("usurname",usurname)
        contentValues.put("upassword",upassword)
        contentValues.put("uemail",uemail)
        contentValues.put("uage",uage)
        contentValues.put("uweight",uweight)

        val rowId = writableDatabase.insert(USER, null,contentValues)
        return rowId > 0
    }

    fun updateUserWith(uid:Int, uname:String, usurname:String, upassword:String, uemail:String, uage:String, uweight:Double):Boolean {
        var contentValues = ContentValues()
        contentValues.put("uname",uname)
        contentValues.put("usurname",usurname)
        contentValues.put("upassword",upassword)
        contentValues.put("uemail",uemail)
        contentValues.put("uage",uage)
        contentValues.put("uweight",uweight)

        val rowId = writableDatabase.update(USER, contentValues,"uid=$uid",null)
        return rowId > 0
    }

    fun deleteUserWith(uid:Int):Boolean {

        val rowId = writableDatabase.delete(USER, "uid=$uid",null)
        return rowId > 0
    }

    fun selectAllUser() : ArrayList<UserModel>{
        var users:ArrayList<UserModel> = ArrayList()

        var cursor = readableDatabase.rawQuery(SELECT_USER,null)

        if (cursor.moveToFirst()){
            while (!cursor.isAfterLast){
                val user = UserModel()
                user.uid = cursor.getInt(cursor.getColumnIndex("uid"))
                user.uname = cursor.getString(cursor.getColumnIndex("uname"))

                user.usurname = cursor.getString(cursor.getColumnIndex("usurname"))
                user.upassword = cursor.getString(cursor.getColumnIndex("upassword"))
                user.uemail = cursor.getString(cursor.getColumnIndex("uemail"))

                user.uage = cursor.getInt(cursor.getColumnIndex("uage")).toString()
                user.uweight = cursor.getDouble(cursor.getColumnIndex("uweight"))

                users.add(user)
                cursor.moveToNext()

            }
        }
        cursor.close()
        return users

    }

}