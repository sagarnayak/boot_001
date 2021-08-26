package com.example.boot_001.controllers

import com.example.boot_001.entities.User
import com.example.boot_001.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/user")
class User {

    @Autowired
    private lateinit var userRepository: UserRepository

    @GetMapping
    fun getUser(): User {
        return User(
            name = "Sagar"
        )
    }

    @GetMapping("/all")
    fun getAllUsers(): ArrayList<User> {
        val toRet: ArrayList<User> = ArrayList()
        userRepository.findAll().map {
            toRet.add(it)
        }

        return toRet
    }

    @PostMapping
    fun addUser(@Valid @RequestBody user: User): User {
        userRepository.save(
            User(name = "Sagar")
        )
        return User(name = "Sagar")
    }
}