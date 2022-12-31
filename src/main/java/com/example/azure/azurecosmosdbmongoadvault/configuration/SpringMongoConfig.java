package com.example.azure.azurecosmosdbmongoadvault.configuration;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@EnableAutoConfiguration
public class SpringMongoConfig {


    @Value("${database.name}")
    private String databaseName;
    @Value("${${key-vault-secret.varName}}")
    private String connectionURL = "defaultValue\n";


    @Bean
    public MongoClient mongo() {
        System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n",connectionURL));
        System.out.println("mongo db databaseName---"+databaseName);
        ConnectionString connectionString = new ConnectionString(connectionURL);
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), databaseName);
    }
}
