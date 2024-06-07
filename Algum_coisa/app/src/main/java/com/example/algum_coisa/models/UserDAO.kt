package com.example.algum_coisa.models

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.text.Collator.PRIMARY

private operator fun Any.invoke(any: Any, any1: Any, any2: Any) {
    TODO("Not yet implemented")
}

class UserDAO(context: Context) : SQLiteOpenHelper
    (context, db_name, null, db_version) {
    companion object {
        private val db_name = "users_db.db"
        private val db_version = 1
        private val table_name = "users"
    }

    override fun onCreate(db: SQLiteDatabase) {

        db.execSQL("CREATE TABLE $table_name (id INTEGER PRIMARY KEY AUTOINCREMENT,email TEXT, password TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        if (oldVersion < newVersion)
            db.execSQL("DROP TABLE $table_name")
        onCreate(db)
    }
}