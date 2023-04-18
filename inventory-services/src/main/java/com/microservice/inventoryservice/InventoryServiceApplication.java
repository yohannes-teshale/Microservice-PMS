package com.microservice.inventoryservice;

import com.microservice.inventoryservice.models.Inventory;
import com.microservice.inventoryservice.repositories.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory= new Inventory();
			inventory.setSomeCode("new Product");
			inventory.setQuantity(99);
			inventoryRepository.save(inventory);
			Inventory inventory2= new Inventory();
			inventory2.setSomeCode("new Product");
			inventory2.setQuantity(99);
			inventoryRepository.save(inventory2);

		};
	}


}
