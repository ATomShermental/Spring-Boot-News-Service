package com.atomshermental.springbootnewsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class Comment {
    CommentRequest commentShablon;
    Date date;

    public Comment() {

    }
}
