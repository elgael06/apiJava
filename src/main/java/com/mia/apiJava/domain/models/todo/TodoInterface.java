package com.mia.apiJava.domain.models.todo;

import com.mia.apiJava.domain.output.todo.TodoItemModel;

import java.util.List;

public interface TodoInterface {
    public TodoItemModel addList(String item);
    public List<TodoItemModel>  getList();
}
