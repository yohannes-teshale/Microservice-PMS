package com.microservice.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class OrderServiceApplicationTests {

    @Container
    static MySQLContainer mySQLContainer= new MySQLContainer("mysql:8.0");


    @Test
    void contextLoads() {



    }

}
