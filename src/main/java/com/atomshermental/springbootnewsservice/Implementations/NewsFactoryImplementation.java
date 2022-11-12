package com.atomshermental.springbootnewsservice.Implementations;

import com.atomshermental.springbootnewsservice.Interfaces.NewsFactory;
import com.atomshermental.springbootnewsservice.Objects.News;
import com.atomshermental.springbootnewsservice.model.NewsRequest;
import java.time.Instant;
import java.util.Date;

public class NewsFactoryImplementation implements NewsFactory {
    public News createNews(NewsRequest newsRequest){
        return News.builder()
                .date(Date.from(Instant.now()))
                .author(newsRequest.getAuthor())
                .subtitle(newsRequest.getSubtitle())
                .header(newsRequest.getHeader())
                .text(newsRequest.getText())
                .build();
    }

}
