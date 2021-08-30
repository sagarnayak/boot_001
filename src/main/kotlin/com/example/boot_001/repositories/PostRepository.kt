package com.example.boot_001.repositories

import com.example.boot_001.entities.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, String> {}