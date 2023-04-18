package com.microservice.inventoryservice.repositories;

import com.microservice.inventoryservice.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    public Optional<Inventory> findBySomeCode(String someCode);
}
