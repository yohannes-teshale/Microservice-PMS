package com.products.productsmicroservice.services;

import com.products.productsmicroservice.DTO.ProductRequest;
import com.products.productsmicroservice.DTO.ProductResponse;
import com.products.productsmicroservice.models.Products;
import com.products.productsmicroservice.repositories.ProductServiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductServiceRepository productServiceRepository;
    public void createProduct(ProductRequest productRequest){
        Products product= Products.builder().
                name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productServiceRepository.save(product);
        log.info("new product id:{}, saved", product.getId());

    }


    public List<ProductResponse> getAllProducts() {
        List<Products> allProducts = productServiceRepository.findAll();
        return allProducts.stream().map(this::mapToProductResponse).toList();

    }

    private ProductResponse mapToProductResponse(Products product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .build();
    }
}
