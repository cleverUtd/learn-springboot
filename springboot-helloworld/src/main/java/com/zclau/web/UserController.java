package com.zclau.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuzicong on 4/4/2017.
 */
@RestController
@EnableAutoConfiguration
public class UserController {

    @RequestMapping("/users")
    public Map users() {
        Map result = new HashMap();
        result.put("rcode", 0);
        result.put("msg", "ok");
        result.put("result", "zclau");
        return result;
    }
}
