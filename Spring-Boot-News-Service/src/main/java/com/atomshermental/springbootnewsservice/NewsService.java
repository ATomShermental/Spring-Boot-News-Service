package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.model.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@AllArgsConstructor
@Service
public class NewsService {

    private final NewsRepository newsRepository;
    public List<NewsShablon> getNewsList() {
        List<News> list = newsRepository.getNewsList();
        List<NewsShablon> newsShablon = new ArrayList<>();
        ListIterator<News> it = list.listIterator();
        while(it.hasNext()){

            News news = it.next();
            NewsShablon shablon = new NewsShablon(news.getId(),news.getHeader());
            newsShablon.add(shablon);
        }
        return newsShablon;
    }

    public News getNews(Long id) {
        return newsRepository.getNewsForId(id);
    }

    public List<Comment> getComments(Long id) {
        return newsRepository.getNewsForId(id).getComments();
    }

    public void setComment(Long id, CommentRequest commentShablon) {
        News news = newsRepository.getNewsForId(id);
        List<Comment> comments = news.getComments();
        Comment comment1 = new Comment();
        comment1.setCommentShablon(commentShablon);
        comment1.setDate(Date.from(Instant.now()));

        comments.add(comment1);
        news.setComments(comments);
        newsRepository.save(id,news);
    }

    public void addNews(NewsRequest newsRequest) {
        List<News> list = newsRepository.getNewsList();
        Long max = 0L;
        for(var x : list){
            if(x.getId() >= max){
                max = x.getId();
            }
        }
        News news = new News();
        news.setDate(Date.from(Instant.now()));
        news.setId(max+1);
        news.setAuthor(newsRequest.getAuthor());
        news.setSubtitle(newsRequest.getSubtitle());
        news.setHeader(newsRequest.getHeader());
        news.setText(newsRequest.getText());
        newsRepository.save(news.getId(), news);
    }
}
