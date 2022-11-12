package com.atomshermental.springbootnewsservice.Interfaces;

import com.atomshermental.springbootnewsservice.Objects.News;
import com.atomshermental.springbootnewsservice.model.*;



public interface NewsFactory {
    News createNews(NewsRequest newsRequest);

}
