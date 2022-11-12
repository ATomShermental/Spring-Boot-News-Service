package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Implementations.CommentFactoryImplementation;
import com.atomshermental.springbootnewsservice.Implementations.NewsFactoryImplementation;
import com.atomshermental.springbootnewsservice.Implementations.NewsRepositoryImplementation;
import com.atomshermental.springbootnewsservice.Interfaces.CommentFactory;
import com.atomshermental.springbootnewsservice.Interfaces.NewsFactory;
import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.Objects.News;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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