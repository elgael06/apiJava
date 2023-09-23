package com.mia.apiJava.infrastructure.services;

import com.mia.apiJava.domain.models.todo.TodoInterface;
import com.mia.apiJava.domain.output.todo.TodoItemModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryTodoService implements TodoInterface {

    private final List<TodoItemModel> list = new ArrayList<TodoItemModel>();


    public TodoItemModel  addList(String desc) {
        int id = list.size() + 1;
        TodoItemModel item = new TodoItemModel(id, desc);
        list.add(item);
        return  item;
    }

    @Override
    public  List<TodoItemModel> getList() {
        return  list;
    }
}
