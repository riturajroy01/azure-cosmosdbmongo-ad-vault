package com.example.azure.azurecosmosdbmongoadvault.repository;

import com.example.azure.azurecosmosdbmongoadvault.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AzureCosmosRepository extends MongoRepository<Employee, String> {
}
