package com.atomshermental.springbootnewsservice.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class News {
    Long id;
    String header;
    String subtitle;
    String text;
    String author;
    List<Comment> comments;
    Date date;


}
