package com.example.todoalone.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table("tbl_todo_list")
class Todo(
    @Id
    @GeneratedValue
    val id : Long = 0,

    @Column(name= "title")
    var title : String,

    @Column(name = "description")
    var description : String,

    @Column(name = "done")
    var done : Boolean,

    @Column(name = "created_at")
    var createdAt : LocalDateTime,

    @Column(name = "updated_at")
    var updateedAt : LocalDateTime,

){

    fun update(title : String, description: String, done : Boolean){
        this.title = title
        this.description = description
        this.done = done
        updateedAt = LocalDateTime.now()
    }

}