package com.mia.apiJava.application.controller;

import com.mia.apiJava.domain.inputs.todo.TodoItemDTO;
import com.mia.apiJava.domain.models.todo.TodoGatewayInterface;
import com.mia.apiJava.domain.output.todo.TodoItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/todo")
public class TodoController {
    @Autowired
    private TodoGatewayInterface gateway;

    @GetMapping
    public  List<TodoItemModel> listTodo() {
        return gateway.findAll();
    }

    @PostMapping
    public  TodoItemModel addList(@RequestBody TodoItemDTO value) {
        return gateway.create(value.item);
    }
}
