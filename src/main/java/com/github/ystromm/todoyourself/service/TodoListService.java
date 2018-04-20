package com.github.ystromm.todoyourself.service;

import com.github.ystromm.todoyourself.domain.TodoItem;

import javax.inject.Inject;
import java.util.Collection;

public class TodoListService {
    private final TodoListRepository todoListRepository;

    @Inject
    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public Collection<TodoItem> getAllDue() {
        throw new IllegalStateException();
    }
}
