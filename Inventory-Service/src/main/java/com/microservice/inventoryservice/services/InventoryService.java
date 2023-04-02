package com.microservice.inventoryservice.services;

import com.microservice.inventoryservice.repositories.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String someCode){
      return  inventoryRepository.findBySomeCode().isPresent();
    }



}
