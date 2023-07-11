package com.mia.apiJava.models;

import java.util.ArrayList;
import java.util.List;

public interface TodoInterface {
    public List<TodoItemModel> lista = new ArrayList<TodoItemModel>();


    public default TodoItemModel  addLista(String item) {
        return null;
    };
}
