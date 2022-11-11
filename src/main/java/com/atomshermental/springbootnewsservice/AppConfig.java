package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Implementations.CommentFactoryImplementation;
import com.atomshermental.springbootnewsservice.Implementations.NewsFactoryImplementation;
import com.atomshermental.springbootnewsservice.Interfaces.CommentFactory;
import com.atomshermental.springbootnewsservice.Interfaces.NewsFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CommentFactory refreshTokenFactory() {
        return new CommentFactoryImplementation();
    }

    @Bean
    public NewsFactory userFactory() {
        return new NewsFactoryImplementation();
    }
}