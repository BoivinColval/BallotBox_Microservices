package com.jeremygagner.williamboivin.voteservice.model;

public class Vote {
    private static int AUTO_GENID = 0;
    private final int id;
    private String when;
    private int rank;
    private int electorId, candidateId;

    public Vote(int id, String when, int rank, int electorId, int candidateId) {
        this.id = id;
        this.when = when;
        this.rank = rank;
        this.electorId = electorId;
        this.candidateId = candidateId;
    }

    public Vote(String when, int rank, int electorId, int candidateId) {
        this.id = AUTO_GENID++;
        this.when = when;
        this.rank = rank;
        this.electorId = electorId;
        this.candidateId = candidateId;
    }
}
