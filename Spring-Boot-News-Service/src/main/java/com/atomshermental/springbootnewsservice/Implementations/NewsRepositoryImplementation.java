package com.atomshermental.springbootnewsservice.Implementations;

import com.atomshermental.springbootnewsservice.Interfaces.NewsRepository;
import com.atomshermental.springbootnewsservice.Objects.News;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.*;

@RequiredArgsConstructor
@Repository
@Primary
public class NewsRepositoryImplementation implements NewsRepository {

    private final Map<Long,News> storage;
    private Long max = 0L;

    public News getNewsForId(Long id){
        return storage.get(id);
    }

    public List<News> getNewsList(){
       return new ArrayList<>(storage.values());
    }

    public void save(Long id, News news){
        max++;
        storage.put(id,news);
    }
    public Long getMax(){
        return max;
    }
}
