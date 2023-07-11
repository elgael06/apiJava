package com.mia.apiJava.services;

import com.mia.apiJava.models.TodoInterface;
import com.mia.apiJava.models.TodoItemModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService implements TodoInterface {

    private final List<TodoItemModel> lista = new ArrayList<TodoItemModel>();


    public TodoItemModel  addLista(String desc) {
        int id = lista.size() + 1;
        TodoItemModel item = new TodoItemModel(id, desc);
        lista.add(item);
        return  item;
    }

    public  List<TodoItemModel> getLista() {
        return  lista;
    }
}
