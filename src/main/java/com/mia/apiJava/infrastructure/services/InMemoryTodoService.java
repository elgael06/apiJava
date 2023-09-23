package com.mia.apiJava.infrastructure.services;

import com.mia.apiJava.domain.models.todo.TodoInterface;
import com.mia.apiJava.domain.output.todo.TodoItemModel;
import com.mia.apiJava.infrastructure.util.TodoItemGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryTodoService implements TodoInterface {

    private final List<TodoItemModel> list = new ArrayList<TodoItemModel>();
    @Autowired
    private  TodoItemGenerate itemGenerate;

    public TodoItemModel  addList(String desc) {
        int id = itemGenerate.getLastId(list);
        TodoItemModel item = new TodoItemModel(id, desc);
        list.add(item);
        return  item;
    }

    @Override
    public  List<TodoItemModel> getList() {
        return  list;
    }
}
