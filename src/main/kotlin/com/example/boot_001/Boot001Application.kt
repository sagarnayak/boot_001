package com.example.boot_001

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Boot001Application

val log: Logger = LoggerFactory.getLogger(Boot001Application::class.java)

fun main(args: Array<String>) {
    runApplication<Boot001Application>(*args)
}
