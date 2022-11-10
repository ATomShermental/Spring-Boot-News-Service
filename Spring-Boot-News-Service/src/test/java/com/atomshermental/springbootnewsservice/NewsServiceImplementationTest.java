package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.Interfaces.NewsService;
import com.atomshermental.springbootnewsservice.model.News;
import com.atomshermental.springbootnewsservice.model.NewsShablon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.*;

class NewsServiceImplementationTest {

    private NewsRepository newsRepository = new NewsRepositoryMock(Map.of(1L,new News(1L,"hello","hy","Hello i am here", "Jorge",null,null),
            2L,new News(2L,"123","12","444", "Andrew",null,null)));

    private NewsService newsServiceImplementation =  new NewsServiceImplementation(newsRepository);


    @Test
    void getNewsList() {
        var result = newsServiceImplementation.getNewsList();
        NewsShablon newsShablon1 = new NewsShablon(1L,"hello");
        NewsShablon newsShablon2 = new NewsShablon(2L,"123");
        List<NewsShablon> list = new ArrayList<>();
        list.add(newsShablon1);
        list.add(newsShablon2);
        result.sort(Comparator.comparing(NewsShablon::getId));
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