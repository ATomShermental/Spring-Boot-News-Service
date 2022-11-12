package com.atomshermental.springbootnewsservice.Implementations;

import com.atomshermental.springbootnewsservice.Interfaces.CommentFactory;
import com.atomshermental.springbootnewsservice.Interfaces.NewsFactory;
import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.Interfaces.NewsService;
import com.atomshermental.springbootnewsservice.Objects.Comment;
import com.atomshermental.springbootnewsservice.Objects.News;
import com.atomshermental.springbootnewsservice.model.*;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.*;

@RequiredArgsConstructor

@Service

public class NewsServiceImplementation implements NewsService {

    private final NewsRepository newsRepository;
    private final NewsFactory newsFactory;
    private final CommentFactory commentFactory;



    public List<NewsSample> getNewsList() {
        List<News> list = newsRepository.getNewsList();
        List<NewsSample> newsSample = list.stream().map(news -> new NewsSample(news.getId(), news.getHeader())).toList();
        return newsSample;
    }

    public News getNews(Long id) {
        return newsRepository.getNewsForId(id);
    }

    public List<Comment> getComments(Long id) {
        return newsRepository.getNewsForId(id).getComments();
    }

    public void setComment(Long id, CommentRequest commentRequest) {
        News news = newsRepository.getNewsForId(id);
        List<Comment> comments = news.getComments();
        Comment newComment = commentFactory.createComment(commentRequest);


        comments.add(newComment);
        news.setComments(comments);
        newsRepository.save(id,news);
    }

    public void addNews(NewsRequest newsRequest) {
        News news = newsFactory.createNews(newsRequest);
        news.setId(newsRepository.getMax()+1);


        newsRepository.save(news.getId(), news);
    }
}
