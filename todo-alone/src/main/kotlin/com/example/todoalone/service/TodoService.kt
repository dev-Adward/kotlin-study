package com.example.todoalone.service

import com.example.todoalone.api.model.TodoRequest
import com.example.todoalone.domain.Todo
import com.example.todoalone.domain.TodoRepository
import com.sun.xml.bind.v2.TODO
import org.springframework.data.domain.Sort
import org.springframework.data.domain.Sort.Direction
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.util.Assert
import org.springframework.web.server.ResponseStatusException
import java.time.LocalDateTime


@Service
class TodoService (val todoRepository: TodoRepository){

    @Transactional(readOnly = true)
    fun findAll() : List<Todo>{
        return todoRepository.findAll(Sort.by(Direction.DESC))
    }


    @Transactional(readOnly = true)
    fun findById( id : Long) : Todo {
        return todoRepository.findByIdOrNull(id) ?: throw
                ResponseStatusException(HttpStatus.BAD_GATEWAY)
    }

    @Transactional(readOnly = true)
    fun create (request : TodoRequest) {

        checkNotNull(request) {
            "Todo Request is Null"
        }

        val todo  = Todo(
            title = request.title,
            description = request.description,
            done = request.done,
            createdAt = LocalDateTime.now(),
            updateedAt = LocalDateTime.now()
        )
        todoRepository.save(todo)
    }
}