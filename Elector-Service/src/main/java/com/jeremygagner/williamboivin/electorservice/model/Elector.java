package com.jeremygagner.williamboivin.electorservice.model;

public class Elector {
    private static int AUTO_GENID = 0;
    private final int id;
    private String login;
    private String password;
    private int weight;
    private String email;

    public Elector(int id, String login, String password, int weight, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.weight = weight;
        this.email = email;
    }

    public Elector(String login, String password, int weight, String email) {
        this.id = AUTO_GENID++;
        this.login = login;
        this.password = password;
        this.weight = weight;
        this.email = email;
    }
}
