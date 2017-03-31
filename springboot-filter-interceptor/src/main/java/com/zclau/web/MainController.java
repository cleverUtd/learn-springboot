package com.zclau.web;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuzicong on 31/3/2017.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    String index() {
        return "Hello World";
    }


}
