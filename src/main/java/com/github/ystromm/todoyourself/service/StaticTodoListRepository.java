package com.github.ystromm.todoyourself.service;

import com.github.javafaker.Faker;
import com.github.ystromm.todoyourself.domain.TodoItem;
import com.github.ystromm.todoyourself.domain.TodoList;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class StaticTodoListRepository implements TodoListRepository {
    public static final Random RANDOM = new Random();
    private static Faker faker = Faker.instance();
    Collection<TodoList> todoLists = Arrays.asList(todoList(), todoList());

    @Override
    public Collection<TodoList> getAll() {
        return todoLists;
    }

    private static TodoList todoList() {
        final TodoItem todo1 = todoItem(faker.shakespeare().hamletQuote(), 1);
        final TodoItem todo2 = todoItem(faker.chuckNorris().fact(), 2);
        final TodoItem todo3 = todoItem(faker.superhero().name(), -24);
        return TodoList.builder().items(Arrays.asList(todo1, todo2, todo3)).build();
    }

    private static TodoItem todoItem(String s, int i) {
        return TodoItem.builder().description(s).done(RANDOM.nextBoolean()).due(Instant.now().minus(i, ChronoUnit.HOURS)).build();
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
