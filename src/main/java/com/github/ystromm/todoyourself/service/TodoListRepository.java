package com.github.ystromm.todoyourself.service;

import com.github.ystromm.todoyourself.domain.TodoList;

import java.util.Collection;

public interface TodoListRepository {
    Collection<TodoList> getAll();

    abstract TodoList get(String id);

    String create(TodoList todoList);
}
