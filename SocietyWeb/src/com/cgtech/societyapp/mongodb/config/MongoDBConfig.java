package com.cgtech.societyapp.mongodb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages="com.cgtech.societyapp.mongodb.repository")
public class MongoDBConfig {
	
	@Bean
    public  MongoDbFactory mongoDbFactory() throws Exception {
    	MongoClient mongoClient = new MongoClient("127.0.0.1",27017);
    	UserCredentials userCredentials = new UserCredentials("","");
        return new SimpleMongoDbFactory(mongoClient, "societyDB",userCredentials);
    }
	@Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
	
}
