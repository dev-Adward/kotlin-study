package com.example.todoalone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoAloneApplication

fun main(args: Array<String>) {
	runApplication<TodoAloneApplication>(*args)
}
