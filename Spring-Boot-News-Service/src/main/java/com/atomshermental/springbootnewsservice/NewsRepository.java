package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.model.Comment;
import com.atomshermental.springbootnewsservice.model.News;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@AllArgsConstructor
@Repository
public class NewsRepository {

    private final Map<Long,News> storage = new HashMap<>(Map.of(1L,new News(1L,"hello","hy","Hello i am here", "Jorge",null,null),
            2L,new News(2L,"123","12","444", "Andrew",null,null)));





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
