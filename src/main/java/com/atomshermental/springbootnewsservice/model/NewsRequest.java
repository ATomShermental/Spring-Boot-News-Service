package com.atomshermental.springbootnewsservice.model;

import lombok.Data;


@Data
public class NewsRequest {

    String header;
    String subtitle;
    String text;
    String author;


}
