package com.github.ystromm.todoyourself.service;

import com.github.ystromm.todoyourself.domain.TodoItem;
import com.github.ystromm.todoyourself.domain.TodoList;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Collections;

public class TodoListRepositoryImpl implements TodoListRepository {
    @Override
    public Collection<TodoList> getAll() {
        final TodoItem todo1 = TodoItem.builder().description("1").done(false).due(Instant.now().minus(1, ChronoUnit.HOURS)).build();
        final TodoItem todo2 = TodoItem.builder().description("2").done(false).due(Instant.now().minus(2, ChronoUnit.HOURS)).build();
        return Collections.singletonList(TodoList.builder().item(todo1).item(todo2).build());
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
