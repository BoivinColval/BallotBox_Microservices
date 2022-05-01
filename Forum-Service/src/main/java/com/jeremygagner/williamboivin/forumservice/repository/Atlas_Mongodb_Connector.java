package com.jeremygagner.williamboivin.forumservice.repository;

import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.sql.SQLException;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Atlas_Mongodb_Connector implements I_Mongodb_Connector{
    private MongoDatabase database;

    public Atlas_Mongodb_Connector(){
        connect();
    }

    @Override
    public void connect() {
        /*CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        ConnectionString connectionString = new ConnectionString("mongodb+srv://dbBoivin:colval2022@bdacluster.terxi.mongodb.net/BDACluster?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        MongoClient mongoClient = MongoClients.create(settings);database = mongoClient.getDatabase("BallotBox");
        MongoClientURI uri = new MongoClientURI(connectionString.toString());
        MongoClient client = new MongoClient(uri);
        database = client.getDatabase("BallotBox").withCodecRegistry(pojoCodecRegistry);*/


        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        String connectionString = "mongodb+srv://dbBoivin:colval2022@bdacluster.terxi.mongodb.net/BDACluster?retryWrites=true&w=majority";
        MongoClientURI uri = new MongoClientURI(connectionString);
        MongoClient client = new MongoClient(uri);
        database = client.getDatabase("BallotBox").withCodecRegistry(pojoCodecRegistry);
    }

    @Override
    public MongoDatabase getDataBase() {
        return this.database;
    }
}
