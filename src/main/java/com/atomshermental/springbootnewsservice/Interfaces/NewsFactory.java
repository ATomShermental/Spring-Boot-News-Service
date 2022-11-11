package com.atomshermental.springbootnewsservice.Interfaces;

import com.atomshermental.springbootnewsservice.Objects.News;
import com.atomshermental.springbootnewsservice.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public interface NewsFactory {
    News createNews(NewsRequest newsRequest);

}
