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

/*
Inheritance in entities

@Entity
abstract class Employee () {}

@Entity
class FullTimeEmployee extends Employee () {}

@Entity
class PartTimeEmployee extends Employee () {}

WAY 1
===============================
SINGLE TABLE
to save all data in a single table
@Inheritance ( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn ( name = "EmployeeType" )
this is the default one
===============================

WAY 2
===============================
TABLE PER CLASS
to save data in separate class
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
@DiscriminatorColumn ( name = "EmployeeType" )
Each concrete sub-class are stored in its separate table.
Common columns are saved for each employee
===============================

WAY 3
===============================
JOINED
Common columns are saved in parent table.
sub-class have their own table with own columns.
@Inheritance ( strategy = InheritanceType.JOINED )
===============================

WAY 4
===============================
USING MAPPED SUPER CLASS
The super class is only there for mapping. It is not an entity

@MappedSuperClass
abstract class Employee () {}

There is no table for parent class.
All data are stored in separate table for child entities.
===============================

WHAT TO USE AND WHEN
===============================
Data integrity and data quality is best in joined.
Single table is best for performance.
===============================
 */