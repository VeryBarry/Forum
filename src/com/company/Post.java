package com.company;

/**
 * Created by VeryBarry on 9/22/16.
 */
public class Post {
    int replyId;
    String author;
    String text;

    public Post(int replyID, String author, String text) {
        this.replyId = replyID;
        this.author = author;
        this.text = text;
    }
}
