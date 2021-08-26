package com.example.boot_001.exceptions

import java.util.*

data class ExceptionResponse(
        var message: String = "",
        var timeStamp: Date = Date()
)