package com.jeremygagner.williamboivin.forumservice.model;

public class Forum {
    private static int AUTO_GENID = 0;
    private final int id;
    private String title;
    private String createdOn;
    private int ballotId;

    public Forum(int id, String title, String createdOn, int ballotId) {
        this.id = id;
        this.title = title;
        this.createdOn = createdOn;
        this.ballotId = ballotId;
    }

    public Forum(String title, String createdOn, int ballotId) {
        this.id = AUTO_GENID++;
        this.title = title;
        this.createdOn = createdOn;
        this.ballotId = ballotId;
    }
}
