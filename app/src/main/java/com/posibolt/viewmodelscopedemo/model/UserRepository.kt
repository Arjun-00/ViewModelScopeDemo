package com.posibolt.viewmodelscopedemo.model
import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers() : List<User>{
        delay(8000)
        val users : List<User> = listOf(
            User(1,"Arjun"),
            User(2,"Amal"),
            User(3,"Adarsh"),
            User(4,"Hamsa"),
            User(5,"Moosa"),
            User(6,"Dude"),
        )
        return users
    }
}