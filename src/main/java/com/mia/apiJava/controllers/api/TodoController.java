package com.mia.apiJava.controllers.api;

import com.mia.apiJava.models.TodoItemDTO;
import com.mia.apiJava.models.TodoItemModel;
import com.mia.apiJava.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping
    public  List<TodoItemModel> listTodo() {
        return service.getLista();
    }

    @PostMapping
    public  TodoItemModel addList(@RequestBody TodoItemDTO value) {
        return service.addLista(value.item);
    }
}
