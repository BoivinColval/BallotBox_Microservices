package com.jeremygagner.williamboivin.forumservice.repository;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.sql.SQLException;

public class Atlas_Mongodb_Connector implements I_Mongodb_Connector{
    private MongoDatabase database;

    public Atlas_Mongodb_Connector(){
        connect();
    }
    @Override
    public void connect() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://dbBoivin:colval2022@bdacluster.terxi.mongodb.net/BDACluster?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        MongoClient mongoClient = MongoClients.create(settings);database = mongoClient.getDatabase("BallotBox");
    }

    @Override
    public MongoDatabase getDataBase() {
        return this.database;
    }
}
