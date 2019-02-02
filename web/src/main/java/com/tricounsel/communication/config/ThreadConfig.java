package com.tricounsel.communication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadConfig {

	@Autowired
	private Environment env;
	
    @Bean
    public TaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(Integer.parseInt(env.getProperty("thread.core.pool.size")));
        executor.setMaxPoolSize(Integer.parseInt(env.getProperty("thread.max.pool.size")));
        executor.setThreadNamePrefix("default_thread_executor");
        executor.initialize();
        return executor;
    }
}
