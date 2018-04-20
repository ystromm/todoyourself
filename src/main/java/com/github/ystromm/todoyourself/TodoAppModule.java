package com.github.ystromm.todoyourself;

import com.github.ystromm.todoyourself.service.StaticTodoListRepository;
import com.github.ystromm.todoyourself.service.TodoListRepository;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import java.time.Clock;

@Module
public class TodoAppModule {
    @Provides
    TodoListRepository todoListRepository() {
            return new StaticTodoListRepository();
    }
    @Provides
    @Named("default")
    Clock defaultClock() {
        return Clock.systemDefaultZone();
    }

    @Provides
    @Named("utc")
    Clock utcClock() {
        return Clock.systemUTC();
    }
}
