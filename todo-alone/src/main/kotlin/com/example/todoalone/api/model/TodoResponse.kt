package com.example.todoalone.api.model

import com.example.todoalone.domain.Todo
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import javax.management.monitor.StringMonitor


    data class TodoResponse (
        val id : Long,
        val title : String,
        val description : String,
        val done : Boolean,
        val createdAt : LocalDateTime,
        val updatedAt : LocalDateTime?,


    ) {

        companion object{
            fun of(todo : Todo) : TodoResponse{
                checkNotNull(todo.id)

                return TodoResponse(
                    id = todo.id,
                    title = todo.title,
                    description = todo.description,
                    done = todo.done,
                    createdAt = todo.createdAt,
                    updatedAt = todo.updateedAt,
                )
            }
        }



    }
