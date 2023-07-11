package com.mia.apiJava.controllers.App;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping
    public  String app() {
        return  "hola";
    }
}
