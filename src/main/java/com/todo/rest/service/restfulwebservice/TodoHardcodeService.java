package com.todo.rest.service.restfulwebservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodeService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "abeja", "Learn restaurant programs", new Date(), false));
        todos.add(new Todo(++idCounter, "abeja", "Learn takaway programs", new Date(), false));
        todos.add(new Todo(++idCounter, "abeja", "Learn report programs", new Date(), false));
        todos.add(new Todo(++idCounter, "abeja", "Learn printer programs", new Date(), false));
    }

    public List<Todo> findAll(){
        return todos;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if (todo==null)
            return null;
        if (todos.remove(todo))
            return todo;
        return null;
    }

    private Todo findById(long id) {
        for(Todo todo: todos) {
            if(todo.getId() == id)
                return todo;
        }
        return null;
    }

}
