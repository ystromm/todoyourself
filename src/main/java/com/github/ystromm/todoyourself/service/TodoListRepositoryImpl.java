package com.github.ystromm.todoyourself.service;

import com.github.ystromm.todoyourself.domain.TodoList;

import java.util.Collection;

public class TodoListRepositoryImpl implements TodoListRepository {
    @Override
    public Collection<TodoList> getAll() {
        throw new IllegalStateException();
    }

    @Override
    public TodoList get(String id) {
        throw new IllegalStateException();
    }

    @Override
    public String create(TodoList todoList) {
        throw new IllegalStateException();
    }
}
