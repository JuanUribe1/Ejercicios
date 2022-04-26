package org.example;

import com.mongodb.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MongoClientURI uri = new MongoClientURI("mongodb+srv://root:rootdb@cluster0.09ied.mongodb.net/PruebaAtlas?retryWrites=true&w=majority");
        try (MongoClient mongoClient = new MongoClient(uri)) {
            DB db = mongoClient.getDB("PruebaAtlas");
            DBCollection collect = db.getCollection("users");
            System.out.println(collect.find().next().get("name"));
        }catch (Exception ex){
            System.out.println("una excepcion: problema conexion a la bd" + ex.toString());
        }
    }
}