package com.github.ystromm.todoyourself;

import com.github.ystromm.todoyourself.service.TodoListService;

public class Main {

    public static void main(String... args) {
        System.out.println(new TodoListService().getAllDue());
    }
}
