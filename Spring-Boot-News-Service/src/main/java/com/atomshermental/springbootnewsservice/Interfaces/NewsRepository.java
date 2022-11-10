package com.atomshermental.springbootnewsservice.Interfaces;

import com.atomshermental.springbootnewsservice.model.News;


import java.util.List;
import java.util.Map;

public interface NewsRepository {




    News getNewsForId(Long id);

    List<News> getNewsList();

    void save(Long id, News news);
}
