package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Implementations.CommentFactoryImplementation;
import com.atomshermental.springbootnewsservice.Implementations.NewsFactoryImplementation;
import com.atomshermental.springbootnewsservice.Implementations.NewsRepositoryImplementation;
import com.atomshermental.springbootnewsservice.Implementations.NewsServiceImplementation;
import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.Interfaces.NewsService;
import com.atomshermental.springbootnewsservice.Objects.News;
import com.atomshermental.springbootnewsservice.model.NewsSample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class NewsServiceTest {

    private NewsRepository newsRepository = new NewsRepositoryMock(Map.of(
            2L,new News(2L,"123","12","444", "Andrew",null,null),1L,new News(1L,"hello","hy","Hello i am here", "Jorge",null,null)));

    private NewsService newsService =  new NewsServiceImplementation(newsRepository, new NewsFactoryImplementation(), new CommentFactoryImplementation());


    @Test
    void getNewsList() {
        var result = new ArrayList<>(newsService.getNewsList());
        NewsSample newsSample1 = new NewsSample(1L,"hello");
        NewsSample newsSample2 = new NewsSample(2L,"123");
        List<NewsSample> list = new ArrayList<>();
        list.add(newsSample1);
        list.add(newsSample2);
        result.sort(Comparator.comparing(NewsSample::getId));
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