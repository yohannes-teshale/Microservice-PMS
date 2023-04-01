package com.microservice.orderservice.controllers;

import com.microservice.orderservice.DTO.OrderRequest;
import com.microservice.orderservice.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(
            @RequestBody OrderRequest orderRequest
    ){
        orderService.placeOrder(orderRequest);
        return "Order placed successfully";

    }

}
