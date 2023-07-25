package com.example.todoalone.api.model

import com.example.todoalone.service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("todo/*")
class TodoController (val todoService: TodoService){



}