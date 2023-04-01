package com.microservice.orderservice.services;

import com.microservice.orderservice.DTO.OrderLineItemsDto;
import com.microservice.orderservice.DTO.OrderRequest;
import com.microservice.orderservice.models.Order;
import com.microservice.orderservice.models.OrderLineItems;
import com.microservice.orderservice.repositories.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrdersRepository ordersRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order= new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoListList()
                .stream()
                .map(this::mapFromDto).toList();
        order.setOrderLineItemsList(orderLineItems);
        ordersRepository.save(order);



    }

    private OrderLineItems mapFromDto(OrderLineItemsDto orderLineItemsDto) {
       return  new OrderLineItems().builder()
                .price(orderLineItemsDto.getPrice())
                .quantity(orderLineItemsDto.getQuantity())
                .someCode(orderLineItemsDto.getSomeCode())
                .build();
    }

}
