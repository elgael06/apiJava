package com.mia.apiJava.infrastructure.util;

import com.mia.apiJava.domain.output.todo.TodoItemModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoItemGenerate {
    public int getLastId(List<TodoItemModel> list) {
        return  list.size() + 1;
    }
}
