package com.test.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    @GetMapping("/greeting")
    public String hello() {
        return "Hello World!";  //To change body of generated methods, choose Tools | Templates.
    }

}
