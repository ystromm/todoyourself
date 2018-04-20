package com.github.ystromm.todoyourself.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.time.Clock;

@Singleton
public class ReminderService {
    private final Clock clock;
    private final TodoListRepository todoListRepository;
    private final Repository<Clock> clockRepository;


    @Inject
    public ReminderService(TodoListRepository todoListRepository, @Named("default") Clock clock, Repository<Clock> clockRepository) {
        this.clock = clock;
        this.todoListRepository = todoListRepository;
        this.clockRepository = clockRepository;
    }

}
