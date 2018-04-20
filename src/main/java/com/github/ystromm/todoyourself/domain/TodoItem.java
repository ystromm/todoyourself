package com.github.ystromm.todoyourself.domain;

import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class TodoItem {
    private final String description;
    private final boolean done;
    private final Instant due;
}
