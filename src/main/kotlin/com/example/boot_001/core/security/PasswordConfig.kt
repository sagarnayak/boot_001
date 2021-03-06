package com.example.boot_001.core.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
class PasswordConfig {

    @Bean
    public fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder(10)
    }
}