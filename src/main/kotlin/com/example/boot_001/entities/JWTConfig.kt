package com.example.boot_001.entities

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "application.jwt")
class JWTConfig {
    lateinit var secretkey: String
    lateinit var tokenPrefix: String
    var tokenExpirationDays: Int = 0
}