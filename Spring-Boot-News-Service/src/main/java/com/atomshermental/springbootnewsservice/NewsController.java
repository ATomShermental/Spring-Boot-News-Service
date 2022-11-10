package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.model.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/news")
@AllArgsConstructor
public class NewsController {

        private final NewsServiceImplementation newsServiceImplementation;

        @GetMapping("/getNews")
        public List<NewsShablon> getNewsList(){
                return newsServiceImplementation.getNewsList();
        }

        @GetMapping("/getNews/{Id}")
        public News getNews(@PathVariable Long id){
                return newsServiceImplementation.getNews(id);
        }

        @GetMapping("/getComments/{Id}")
        public List<Comment> getComments(@PathVariable Long id){
                return newsServiceImplementation.getComments(id);
        }

        @PostMapping("/setComment/{Id}")
        public void setComment(@PathVariable Long id, @RequestBody CommentRequest commentShablon){
               newsServiceImplementation.setComment(id, commentShablon);
        }

        @PostMapping("/addNews")
        public void addNews(@RequestBody NewsRequest newsRequest){
                newsServiceImplementation.addNews(newsRequest);
        }
}
