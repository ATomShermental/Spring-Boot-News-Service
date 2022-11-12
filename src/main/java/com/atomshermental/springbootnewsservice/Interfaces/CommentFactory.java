package com.atomshermental.springbootnewsservice.Interfaces;

import com.atomshermental.springbootnewsservice.Objects.Comment;
import com.atomshermental.springbootnewsservice.model.CommentRequest;


public interface CommentFactory {

  Comment createComment(CommentRequest commentRequest);

}
