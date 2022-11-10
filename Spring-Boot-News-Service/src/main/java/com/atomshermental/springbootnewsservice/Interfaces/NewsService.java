package com.atomshermental.springbootnewsservice.Interfaces;

import com.atomshermental.springbootnewsservice.model.*;


import java.util.List;

public interface NewsService {


     List<NewsShablon> getNewsList();

    News getNews(Long id);

     List<Comment> getComments(Long id);

     void setComment(Long id, CommentRequest commentShablon);
    void addNews(NewsRequest newsRequest);
}
