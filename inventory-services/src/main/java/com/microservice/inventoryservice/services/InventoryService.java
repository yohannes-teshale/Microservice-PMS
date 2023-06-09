package com.microservice.inventoryservice.services;

import com.microservice.inventoryservice.repositories.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional

public class InventoryService {
    private final InventoryRepository inventoryRepository;
@Transactional(readOnly = true)
    public boolean isInStock(String someCode){
      return  inventoryRepository.findBySomeCode(someCode).isPresent();
    }



}
