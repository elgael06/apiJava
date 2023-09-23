package com.mia.apiJava.infrastructure.gateway;
import com.mia.apiJava.domain.models.todo.TodoGatewayInterface;
import com.mia.apiJava.domain.models.todo.TodoInterface;
import com.mia.apiJava.domain.output.todo.TodoItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TodoGateway implements TodoGatewayInterface {
    @Autowired
    private TodoInterface service;


    @Override
    public List<TodoItemModel> findAll() {
        return service.getList();
    }

    @Override
    public TodoItemModel findById(int id) {
        return null;
    }

    @Override
    public TodoItemModel create(String item) {
        return service.addList(item);
    }
}
