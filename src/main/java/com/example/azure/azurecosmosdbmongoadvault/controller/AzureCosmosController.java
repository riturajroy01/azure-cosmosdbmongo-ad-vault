package com.example.azure.azurecosmosdbmongoadvault.controller;

import com.example.azure.azurecosmosdbmongoadvault.entity.Employee;
import com.example.azure.azurecosmosdbmongoadvault.repository.AzureCosmosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AzureCosmosController {

    @Autowired
    AzureCosmosRepository azureCosmosRepository;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return azureCosmosRepository.save(employee);
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return azureCosmosRepository.findAll();
    }



}
