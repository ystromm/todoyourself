package com.github.ystromm.todoyourself.service;

import java.util.Collection;

public interface Repository<T> {
    Collection<T> getAll();

    T get(String id);

    String create(T todoList);
}
