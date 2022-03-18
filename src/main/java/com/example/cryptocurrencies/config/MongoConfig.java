package com.example.cryptocurrencies.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${app.persistence.database.name}")
    private String dataBaseName;

    @Value("${app.persistence.database.url}")
    private String dataBaseUrl;

    @Value("${app.persistence.entities.base-package}")
    private String basePackage;

    @Override
    protected String getDatabaseName() {
        return dataBaseName;
    }

    @Override
    public MongoClient mongoClient() {
        var connectionString = new ConnectionString(dataBaseUrl);
        var mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    @Override
    public Collection getMappingBasePackages() {
        return Collections.singleton(basePackage);
    }
}