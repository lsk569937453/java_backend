package com.lsk.backend;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author shikai.liu
 * @version 1.0
 * @date 2020/8/25 0025 20:32
 */
@Configuration
public class DefaultConfiguration {
    @Value("${spring.redis.host}") String host;
    @Value("${spring.redis.port}") int port;


    @Bean
    public RedisCommands<String,String> initRedis(){
        RedisURI redisUri = RedisURI.builder()                    // <1> 创建单机连接的连接信息
                .withHost(host)
                .withPort(port)
                .withTimeout(Duration.of(10, ChronoUnit.SECONDS))
                .build();
        RedisClient redisClient = RedisClient.create(redisUri);   // <2> 创建客户端
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        RedisCommands<String,String> redisCommands=connection.sync();
        return redisCommands;
    }
    @Bean
    public OkHttpClient okHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(1, TimeUnit.SECONDS)
                .readTimeout(1, TimeUnit.SECONDS)
                .writeTimeout(1, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        return builder.build();

    }
}
