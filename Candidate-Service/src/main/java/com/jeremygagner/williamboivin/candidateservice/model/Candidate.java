package com.jeremygagner.williamboivin.candidateservice.model;

public class Candidate {
    private static int AUTO_GENID = 0;
    private final int id;
    private String name;
    private String description;
    private String image;
    private int ballotId;

    public Candidate(int id, String name, String description, String image, int ballotId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.ballotId = ballotId;
    }

    public Candidate(String name, String description, String image, int ballotId) {
        this.id = AUTO_GENID++;
        this.name = name;
        this.description = description;
        this.image = image;
        this.ballotId = ballotId;
    }
}
