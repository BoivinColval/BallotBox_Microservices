package com.jeremygagner.williamboivin.ballotservice.model;

public class Ballot {
    private static int AUTO_GENID = 0;
    private final int id;
    private String title;
    private String start, end;
    private Boolean anonymous;
    private int ownerId;

    public Ballot(int id, String title, String start, String end, Boolean anonymous, int ownerId) {
        this.id = id;
        this.title = title;
        this.start = start;
        this.end = end;
        this.anonymous = anonymous;
        this.ownerId = ownerId;
    }

    public Ballot(String title, String start, String end, Boolean anonymous, int ownerId) {
        this.id = AUTO_GENID++;
        this.title = title;
        this.start = start;
        this.end = end;
        this.anonymous = anonymous;
        this.ownerId = ownerId;
    }
}
