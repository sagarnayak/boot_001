package com.example.boot_001.controllers

import com.example.boot_001.core.LocaleMaster
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Welcome {

    @Autowired
    private lateinit var localeMaster: LocaleMaster

    @GetMapping
    fun hi(): String {
        return localeMaster.getMessage(
            "message.hello"
        )
    }
}

/*
filter out statically
@JsonIgnore // use this to ignore the data variable always
filter out variables dynamically
    @GetMapping
    fun getUsers(): MappingJacksonValue {
        val students = studentRepository.findAll()
        val mappingJacksonValueClass = MappingJacksonValue(students)
        val filter = SimpleFilterProvider().addFilter(
                "someFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("first_name", "last_name")
        )
        mappingJacksonValueClass.filters = filter
        print(students.toString())
        return mappingJacksonValueClass
    }
 */