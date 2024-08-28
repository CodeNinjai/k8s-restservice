package io.bitcrafter.helloworldservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldServiceApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldServiceApplication>(*args)
}
