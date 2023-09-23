package com.mia.apiJava.domain.models.todo;

import com.mia.apiJava.domain.output.todo.TodoItemModel;

import java.util.List;

public interface TodoGatewayInterface {
    List<TodoItemModel> findAll();
    TodoItemModel findById(int id);
    TodoItemModel create(String item);
}
