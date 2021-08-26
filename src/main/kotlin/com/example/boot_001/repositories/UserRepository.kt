package com.example.boot_001.repositories

import com.example.boot_001.entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String> {}