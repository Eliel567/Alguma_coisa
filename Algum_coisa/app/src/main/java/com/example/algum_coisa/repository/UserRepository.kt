package com.example.algum_coisa.repository

import android.content.ContentValues
import android.content.Context
import com.example.algum_coisa.models.User
import com.example.algum_coisa.models.UserDAO

class UserRepository(context: Context) {
    companion object {
        private val table_name = "users"
    }

    val db = UserDAO(context).writableDatabase

    fun insert(user: User): Long {
        val contentValues = ContentValues().apply {
            put("email", user.email)
            put("password", user.password)
        }
        return db.insert(table_name, "", contentValues)
    }

    fun findOne(user: User): User? {
        val cursor = db.query(
            table_name,
            arrayOf("id"),
            "email = ? and password = ?",
            arrayOf(user.email, user.password),
            null,
            null,
            null
        )
        val result = cursor.moveToFirst()
        if (!result) {
            return null //Caso não tenha encontrado
        }
        val id = cursor.getLong(0)
        cursor.close()
        return User(
            id,
            user.email,
            user.password
        )
    }
}