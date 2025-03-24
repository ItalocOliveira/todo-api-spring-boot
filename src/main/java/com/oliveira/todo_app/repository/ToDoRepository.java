package com.oliveira.todo_app.repository;

import com.oliveira.todo_app.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public class ToDoRepository extends JpaRepository<ToDo,Long> {
}
