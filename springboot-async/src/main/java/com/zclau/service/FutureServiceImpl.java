package com.zclau.service;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created by liuzicong on 16/7/2017.
 */
@Service
public class FutureServiceImpl implements IFutureService {


    @Override
    public Future<Integer> randomNumber() {
        System.out.println(Thread.currentThread().getName());
        Random random = new Random();
        int num = random.nextInt(1000);
        return new AsyncResult<>(num);
    }
}
