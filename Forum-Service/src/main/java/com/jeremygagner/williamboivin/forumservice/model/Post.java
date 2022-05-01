package com.jeremygagner.williamboivin.forumservice.model;

public class Post {
    private static int AUTO_GENID = 0;
    private final int id;
    private String message;
    private String date;
    private int electorId;

    public Post(int id, String message, String date, int electorId) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.electorId = electorId;
    }

    public Post(String message, String date, int electorId) {
        this.id = AUTO_GENID++;
        this.message = message;
        this.date = date;
        this.electorId = electorId;
    }
}
