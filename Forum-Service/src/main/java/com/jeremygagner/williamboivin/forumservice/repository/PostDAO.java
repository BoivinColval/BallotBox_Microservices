package com.jeremygagner.williamboivin.forumservice.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.jeremygagner.williamboivin.forumservice.model.Post;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.boot.json.GsonJsonParser;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class PostDAO implements IDAO<Post>{
    I_Mongodb_Connector connector;

    public PostDAO() {
        connector = new Atlas_Mongodb_Connector();
    }

    @Override
    public void add(Post Object) {
        /*
        Gson gson = new GsonBuilder().create();
        JsonElement json = gson.toJsonTree(Object, Post.class);
        connector.getDataBase().getCollection("Post", Post.class).insertOne(Document.parse(json.getAsString()));*/
        connector.getDataBase().getCollection("TD05EX03", Post.class).insertOne(Object);
    }

    @Override
    public void delete(int id) {
        Bson filter = eq("id", id);
        connector.getDataBase().getCollection("Post").deleteOne(filter);
    }

    @Override
    public List<Post> readAll() {
        MongoCollection<Post> collection = this.connector.getDataBase().getCollection("Post", Post.class);
        return collection.find().into(new ArrayList<>());
    }

    @Override
    public Post findOne(int id){
        MongoCollection<Document> collection = connector.getDataBase().getCollection("Post");
        Document foundDocument = collection.find(eq("id", id)).first();
        if(foundDocument == null) return null;
        Gson gson = new Gson();
        return gson.fromJson(foundDocument.toJson(), Post.class);
    }

    @Override
    public void update(Post Object) {
        Bson filter = eq("id", Object.getId());
        Bson updates = Updates.combine(
                Updates.set("message", Object.getMessage()),
                Updates.set("date", Object.getDate()),
                Updates.set("electorId", Object.getElectorId()));

        connector.getDataBase().getCollection("Post").updateOne(filter, updates);
    }
}
