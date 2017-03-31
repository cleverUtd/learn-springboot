package com.zclau.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuzicong on 31/3/2017.
 */
public class MyInterceptor extends HandlerInterceptorAdapter {

    Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

    public MyInterceptor() {
        logger.info("MyInterceptor initialize.......");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("MyInterceptor preHandle......");
        return super.preHandle(request, response, handler);
    }

    @PreDestroy
    public void destroy() {
        logger.info("MyInterceptor destroy......");
    }
}
