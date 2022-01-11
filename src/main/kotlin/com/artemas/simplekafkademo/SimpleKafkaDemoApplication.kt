package com.artemas.simplekafkademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleKafkaDemoApplication

fun main(args: Array<String>) {
    runApplication<SimpleKafkaDemoApplication>(*args)
}
