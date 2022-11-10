package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.*;

@RequiredArgsConstructor
@Repository

public class NewsRepositoryMock implements NewsRepository {

    private final Map<Long,News> storage;


    public News getNewsForId(Long id){
        return storage.get(id);
    }

    public List<News> getNewsList(){
        return new ArrayList<News>(storage.values());
    }

    public void save(Long id, News news){
        storage.put(id,news);
    }
}