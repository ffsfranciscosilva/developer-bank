package com.ffs.bank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeveloperBankApplication

fun main(args: Array<String>) {
    runApplication<DeveloperBankApplication>(*args)
}