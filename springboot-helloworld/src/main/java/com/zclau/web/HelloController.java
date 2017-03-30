package com.zclau.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping("/json")
    Map<String, Object> json() {
        Map result = new HashMap();
        result.put("rcode", 0);
        result.put("msg", "ok");
        result.put("result", 11111);
        return result;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
