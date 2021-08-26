package com.example.boot_001.entities

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity(name = "users")
data class User(
    @Id @Column(columnDefinition = " uuid default gen_random_uuid()") val id: UUID = UUID.randomUUID(),
    @field:NotBlank val name: String = ""
)