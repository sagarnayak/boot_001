package com.example.boot_001.core

import org.springframework.context.annotation.Bean
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.context.support.ResourceBundleMessageSource
import org.springframework.stereotype.Component
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver
import java.util.*

@Component
class LocaleMaster {

    fun getMessage(message: String): String {
        return bundleMessageSource().getMessage(
            message,
            null,
            LocaleContextHolder.getLocale()
        )
    }

    @Bean
    fun localeResolver(): LocaleResolver {
        val acceptHeaderLocaleResolver = AcceptHeaderLocaleResolver()
        acceptHeaderLocaleResolver.defaultLocale = Locale.US
        return acceptHeaderLocaleResolver
    }

    fun bundleMessageSource(): ResourceBundleMessageSource {
        val messageSource = ResourceBundleMessageSource()
        messageSource.setBasename("messages")
        return messageSource
    }
}