package com.example.boot_001

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class CommandLineRunnerClass : CommandLineRunner {

    override fun run(vararg args: String?) {
        log.info("Inside the command line runner.")
    }
}