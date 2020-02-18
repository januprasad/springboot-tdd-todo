package com.jk.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.springframework.test.util.AssertionErrors.assertEquals;


@SpringBootTest
public class ToDoServiceTest {

    @Autowired
    private ToDoRepository toDoRepository;

    @Test
    void getAllToDos(){
        ToDo todoSample = new ToDo("Todo Sample 1",true);
        toDoRepository.save(todoSample);

        ToDoService toDoService =  new ToDoService(toDoRepository);
        List<ToDo> toDoList = toDoService.findAll();

        ToDo lastToDo = toDoList.get(0);
        assertEquals(todoSample.getDescription(), lastToDo.getDescription());
        assertEquals(todoSample.isCompleted(), lastToDo.isCompleted());
        assertEquals(todoSample.getId(), lastToDo.getId());
    }
}