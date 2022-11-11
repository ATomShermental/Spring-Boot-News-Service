package com.atomshermental.springbootnewsservice.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NewsRequest {

    String header;
    String subtitle;
    String text;
    String author;


}
