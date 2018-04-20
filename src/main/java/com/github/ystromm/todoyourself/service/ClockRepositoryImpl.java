package com.github.ystromm.todoyourself.service;

import javax.inject.Singleton;
import java.time.Clock;
import java.util.Collection;

@Singleton
public class ClockRepositoryImpl implements ClockRepository {
    @Override
    public Collection<Clock> getAll() {
        return null;
    }

    @Override
    public Clock get(String id) {
        return null;
    }

    @Override
    public String create(Clock item) {
        return null;
    }
}
