package com.github.ystromm.todoyourself;

import com.github.ystromm.todoyourself.service.ReminderService;
import com.github.ystromm.todoyourself.service.TodoListService;
import dagger.Component;

import javax.inject.Singleton;

public class TodoApp {

    @Singleton
    @Component(modules = TodoAppModule.class)
    public interface TodoListServiceProvider {
        TodoListService service();
        ReminderService reminderService();
    }

    public static void main(String... args) {
        final TodoApp.TodoListServiceProvider todoListServiceProvider = DaggerTodoApp_TodoListServiceProvider.builder().build();
        System.out.println(todoListServiceProvider.service().getAllDue());
        todoListServiceProvider.reminderService();
    }
}
