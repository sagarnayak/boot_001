package com.example.boot_001

import com.example.boot_001.entities.JWTConfig
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(
        JWTConfig::class
)
class Boot001Application

val log: Logger = LoggerFactory.getLogger(Boot001Application::class.java)

fun main(args: Array<String>) {
    runApplication<Boot001Application>(*args)
}
