package com.microservice.orderservice.repositories;

import com.microservice.orderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order,Long> {
}
