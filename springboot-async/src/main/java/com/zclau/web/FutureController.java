package com.zclau.web;

import com.zclau.service.IFutureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by liuzicong on 16/7/2017.
 */
@RestController
public class FutureController {

    @Autowired
    private IFutureService futureService;

    @RequestMapping("/random")
    public String randomNum() {
        try {
            Future<Integer> future = futureService.randomNumber();
            int num = future.get();
            return num + "";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
