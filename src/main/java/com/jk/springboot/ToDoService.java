package com.jk.springboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return this.toDoRepository.findAll();
    }

    public ToDo save(ToDo toDo){
        return this.toDoRepository.save(toDo);
    }
}
