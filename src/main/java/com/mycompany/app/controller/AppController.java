package com.mycompany.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private static final String MESSAGE = "Hello World! This is my Fist Project";

    @GetMapping("/")
    public String getMessage() {
        return MESSAGE;
    }
}

