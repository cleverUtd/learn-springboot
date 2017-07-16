package com.zclau.service;

import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

/**
 * Created by liuzicong on 16/7/2017.
 */
public interface IFutureService {

    @Async
    Future<Integer> randomNumber();
}
