package com.jeremygagner.williamboivin.forumservice.repository;


import com.mongodb.client.MongoDatabase;

public interface I_Mongodb_Connector {
    public void connect();
    public MongoDatabase getDataBase();
}
