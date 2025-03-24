package com.oliveira.todo_app.service;

import com.oliveira.todo_app.entity.ToDo;
import com.oliveira.todo_app.repository.ToDoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private ToDoRepository toDoRepository;

    public TodoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> create(ToDo toDo){
        toDoRepository.save(toDo);
        return list();
    }

    public List<ToDo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return toDoRepository.findAll(sort);
    }

    public List<ToDo> update(ToDo toDo){
        toDoRepository.save(toDo);
        return list();
    }

    public List<ToDo> delete(Long id){
        toDoRepository.deleteById(id);
        return list();
    }
}
