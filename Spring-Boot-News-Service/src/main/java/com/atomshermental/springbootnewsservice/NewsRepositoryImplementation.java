package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.model.News;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@RequiredArgsConstructor
@Repository
public class NewsRepositoryImplementation implements NewsRepository {

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
