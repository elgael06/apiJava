package com.mia.apiJava.application.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping
    public  String app() {
        return  "hola";
    }
}
