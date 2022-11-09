package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.model.News;
import com.atomshermental.springbootnewsservice.model.NewsShablon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewsServiceTest {

    private NewsRepository newsRepository = new NewsRepository();
    private NewsService newsService = new NewsService(newsRepository);


    @Test
    void getNewsList() {
        var result = newsService.getNewsList();
        NewsShablon newsShablon1 = new NewsShablon(1L,"hello");
        NewsShablon newsShablon2 = new NewsShablon(2L,"123");
        List<NewsShablon> list = new ArrayList<>();
        list.add(newsShablon1);
        list.add(newsShablon2);
        Assertions.assertEquals(result, list);

    }

    @Test
    void getNews() {
    }

    @Test
    void getComments() {
    }

    @Test
    void setComment() {
    }

    @Test
    void addNews() {
    }
}