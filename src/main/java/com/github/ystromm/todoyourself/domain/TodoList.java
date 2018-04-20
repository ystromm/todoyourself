package com.github.ystromm.todoyourself.domain;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
public class TodoList {
    @Singular
    private final Collection<TodoItem> items;
}
