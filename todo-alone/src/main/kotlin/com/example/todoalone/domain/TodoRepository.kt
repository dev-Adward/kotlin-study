package com.example.todoalone.domain

import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long>{

    fun findTodosByDoneAndAndDescription() : List<Todo>?
}