package com.products.productsmicroservice.repositories;

import com.products.productsmicroservice.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepository extends MongoRepository<Products,String> {

}
