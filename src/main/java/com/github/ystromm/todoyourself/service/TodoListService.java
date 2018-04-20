package com.github.ystromm.todoyourself.service;

import com.github.ystromm.todoyourself.domain.TodoItem;

import javax.inject.Inject;
import java.time.Instant;
import java.util.Collection;
import java.util.stream.Collectors;

public class TodoListService {
    @Inject
    private TodoListRepository todoListRepository;

    public Collection<TodoItem> getAllDue() {
        return todoListRepository.getAll().stream().flatMap(todoList -> todoList.getItems().stream()).filter(todoItem -> todoItem.getDue().isBefore(Instant.now())).collect(Collectors.toList());
    }
}
