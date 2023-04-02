package com.microservice.inventoryservice.controllers;

import com.microservice.inventoryservice.services.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("someCode") String someCode){
        return inventoryService.isInStock(someCode);

    }
}
