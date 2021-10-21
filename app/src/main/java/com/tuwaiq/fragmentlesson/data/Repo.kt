package com.tuwaiq.fragmentlesson.data

import com.tuwaiq.fragmentlesson.data.model.User

class Repo {
    fun getAllusers(): List<User>{
        val users= mutableListOf<User>()
        for (i in 1..100){
            val user= User(i, "fName $i", "LName $i", i*10)
            users+= user
        }
        return users
    }
}