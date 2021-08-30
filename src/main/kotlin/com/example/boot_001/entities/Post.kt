package com.example.boot_001.entities

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity(name = "post")
data class Post(
    @Id val id: UUID = UUID.randomUUID(),
    @field:NotBlank @Size(min = 3, message = "Name should have at least 3 characters.") val name: String = "",
    @JsonIgnore @ManyToOne(fetch = FetchType.LAZY) var user: User? = null
)

/*
Join table for many-to-many relationship in tables.
@JoinTable(
name = "STUDENT_COURSE_JOIN_TABLE",
joinColumn = @joinColumn ( name = "student_id" ),
inverseJoinColumn = @joinColumn ( name = course_id" )
)
 */