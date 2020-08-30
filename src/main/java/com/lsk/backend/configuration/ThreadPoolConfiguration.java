package com.lsk.backend.configuration;

import io.netty.util.concurrent.DefaultThreadFactory;
import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.*;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/29 0029 9:37
 */
@Configuration
public class ThreadPoolConfiguration {
    @Bean("defaultPool")
    public ExecutorService initPool(){
        int threadSize=Runtime.getRuntime().availableProcessors();
        ThreadFactory threadFactory=new CustomizableThreadFactory("defaultPool-");
        ExecutorService executorService= new ThreadPoolExecutor(threadSize, threadSize,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(),threadFactory);
        return executorService;
    }
}
