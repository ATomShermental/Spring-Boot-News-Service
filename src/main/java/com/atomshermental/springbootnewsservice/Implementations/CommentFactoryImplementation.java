package com.atomshermental.springbootnewsservice.Implementations;

import com.atomshermental.springbootnewsservice.Interfaces.CommentFactory;
import com.atomshermental.springbootnewsservice.Objects.Comment;
import com.atomshermental.springbootnewsservice.model.CommentRequest;
import java.sql.Date;
import java.time.Instant;

public class CommentFactoryImplementation implements CommentFactory {

    public Comment createComment(CommentRequest commentRequest){
        return Comment.builder()
                .text(commentRequest.getText())
                .author(commentRequest.getAuthor())
                .date(Date.from(Instant.now()))
                .build();
    }

}
