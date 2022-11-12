package com.atomshermental.springbootnewsservice;

import com.atomshermental.springbootnewsservice.Interfaces.NewsService;
import com.atomshermental.springbootnewsservice.Objects.Comment;
import com.atomshermental.springbootnewsservice.Objects.News;
import com.atomshermental.springbootnewsservice.model.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/news")
@AllArgsConstructor
public class NewsController {

        private final NewsService newsService;

        @GetMapping("/getNews")
        public List<NewsSample> getNewsList(){
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
        public void setComment(@PathVariable Long id, @RequestBody CommentRequest commentSample){
               newsService.setComment(id, commentSample);
        }

        @PostMapping("/addNews")
        public void addNews(@RequestBody NewsRequest newsRequest){
                newsService.addNews(newsRequest);
        }
}
