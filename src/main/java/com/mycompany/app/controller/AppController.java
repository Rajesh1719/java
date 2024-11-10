package com.mycompany.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private static final String MESSAGE = "Hello World!";

    @GetMapping("/")
    public String getMessage() {
        return MESSAGE;
    }
}

