package com.atomshermental.springbootnewsservice.Interfaces;

import com.atomshermental.springbootnewsservice.Objects.News;



import java.util.List;

public interface NewsRepository {




    Long getMax();
    News getNewsForId(Long id);

    List<News> getNewsList();

    void save(Long id, News news);
}
