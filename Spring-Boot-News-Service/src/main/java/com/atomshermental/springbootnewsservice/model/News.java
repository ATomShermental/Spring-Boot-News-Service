package com.atomshermental.springbootnewsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class News {
    Long id;
    String header;
    String subtitle;
    String text;
    String author;
    List<Comment> comments;
    Date date;

    public News() {

    }
}
