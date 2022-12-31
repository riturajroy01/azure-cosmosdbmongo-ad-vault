package com.example.azure.azurecosmosdbmongoadvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class AzureCosmosdbmongoAdVaultApplication  /*implements CommandLineRunner*/{

   /* @Value("${spring-azure-keyvault2-secret}")
    private String connectionString;*/

    public static void main(String[] args) {
        SpringApplication.run(AzureCosmosdbmongoAdVaultApplication.class, args);
    }


  /*  @GetMapping("get")
    public String get() {
        return connectionString;
    }

    public void run(String... varl) throws Exception {
        System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n",connectionString));
    }*/

}
