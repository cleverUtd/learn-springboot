package com.zclau.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by liuzicong on 31/3/2017.
 */
@Component
@Order(2)
public class MyFilter1 implements Filter{

    Logger logger = LoggerFactory.getLogger(MyFilter1.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("MyFilter1 initialize......");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("MyFilter1 doFilter......");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("MyFilter1 destroy......");
    }
}
