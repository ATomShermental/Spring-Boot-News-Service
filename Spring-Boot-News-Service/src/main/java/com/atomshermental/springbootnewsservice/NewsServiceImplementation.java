package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.Interfaces.NewsService;
import com.atomshermental.springbootnewsservice.model.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@RequiredArgsConstructor
@Service
public class NewsServiceImplementation implements NewsService {

    private final NewsRepository newsRepositoryImplementation;


    public List<NewsShablon> getNewsList() {
        List<News> list = newsRepositoryImplementation.getNewsList();
        List<NewsShablon> newsShablon = list.stream().map(news -> new NewsShablon(news.getId(), news.getHeader())).toList();
        return newsShablon;
    }

    public News getNews(Long id) {
        return newsRepositoryImplementation.getNewsForId(id);
    }

    public List<Comment> getComments(Long id) {
        return newsRepositoryImplementation.getNewsForId(id).getComments();
    }

    public void setComment(Long id, CommentRequest commentShablon) {
        News news = newsRepositoryImplementation.getNewsForId(id);
        List<Comment> comments = news.getComments();
        Comment newComment = Comment.builder()
                .author(commentShablon.getAuthor())
                .date(Date.from(Instant.now()))
                .text(commentShablon.getText())
                .build();


        comments.add(newComment);
        news.setComments(comments);
        newsRepositoryImplementation.save(id,news);
    }

    public void addNews(NewsRequest newsRequest) {
        List<News> list = newsRepositoryImplementation.getNewsList();
        Long max = 0L;
        for(var x : list){
            if(x.getId() >= max){
                max = x.getId();
            }
        }
        News news = News.builder()
                .id(max+1)
                .date(Date.from(Instant.now()))
                .author(newsRequest.getAuthor())
                .subtitle(newsRequest.getSubtitle())
                .header(newsRequest.getHeader())
                .text(newsRequest.getText())
                .build();


        newsRepositoryImplementation.save(news.getId(), news);
    }
}
