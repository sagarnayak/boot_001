package com.example.boot_001.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Welcome {

    @GetMapping
    fun hi(): String {
        return "Hello there ..."
    }
}