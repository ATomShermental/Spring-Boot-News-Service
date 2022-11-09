package com.atomshermental.springbootnewsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentRequest {
    String text;
    String author;
}
