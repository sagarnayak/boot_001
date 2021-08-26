package com.sagar.spring.boot_001

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Boot001Application

fun main(args: Array<String>) {
    runApplication<Boot001Application>(*args)
}
