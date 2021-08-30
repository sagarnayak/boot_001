package com.example.boot_001.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity(name = "users")
data class User(
    @Id val id: UUID = UUID.randomUUID(),
    @field:NotBlank @Size(min = 3, message = "Name should have at least 3 characters.") val name: String = "",
    @OneToMany(mappedBy = "user") var posts: List<Post> = ArrayList()
)