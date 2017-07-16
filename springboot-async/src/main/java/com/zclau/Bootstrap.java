package com.zclau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by liuzicong on 16/7/2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableAsync
public class Bootstrap {

    @Bean(name = "zclau-executor")
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(5);
        executor.setQueueCapacity(25);
        return executor;
    }

    @Bean(name = "taskExecutor")
    public TaskExecutor taskExecutor_1() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        return executor;
    }


    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
