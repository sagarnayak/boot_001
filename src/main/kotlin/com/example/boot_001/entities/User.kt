package com.example.boot_001.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity(name = "users")
data class User(
    @Id val id: UUID = UUID.randomUUID(),
    @field:NotBlank val name: String = ""
)