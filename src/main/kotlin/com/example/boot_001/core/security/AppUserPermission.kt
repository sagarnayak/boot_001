package com.example.boot_001.core.security

enum class AppUserPermission(val permission: String) {
    ADMIN_READ("adminRead"),
    ADMIN_WRITE("adminWrite"),
    COURSE_READ("courseRead"),
    COURSE_WRITE("courseWrite")
}