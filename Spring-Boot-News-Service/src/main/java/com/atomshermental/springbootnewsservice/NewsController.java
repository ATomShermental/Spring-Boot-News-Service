package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.model.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/news")
@AllArgsConstructor
public class NewsController {

        private final NewsService newsService;

        @GetMapping("/getNews")
        public List<NewsShablon> getNewsList(){
                return newsService.getNewsList();
        }

        @GetMapping("/getNews/{Id}")
        public News getNews(@PathVariable Long id){
                return newsService.getNews(id);
        }

        @GetMapping("/getComments/{Id}")
        public List<Comment> getComments(@PathVariable Long id){
                return newsService.getComments(id);
        }

        @PostMapping("/setComment/{Id}")
        public void setComment(@PathVariable Long id, @RequestBody CommentRequest commentShablon){
               newsService.setComment(id, commentShablon);
        }

        @PostMapping("/addNews")
        public void addNews(@RequestBody NewsRequest newsRequest){
                newsService.addNews(newsRequest);
        }
}
