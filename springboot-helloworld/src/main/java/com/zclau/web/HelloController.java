package com.zclau.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuzicong on 5/3/2017.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    String name() {
        return "Hello World";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
