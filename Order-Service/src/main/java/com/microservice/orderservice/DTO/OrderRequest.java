package com.microservice.orderservice.DTO;

import com.microservice.orderservice.models.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class OrderRequest {

    private List<OrderLineItemsDto> orderLineItemsDtoListList;


}
