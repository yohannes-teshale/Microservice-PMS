package com.microservice.inventoryservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventory")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    private String someCode;
    private Integer quantity;





}
