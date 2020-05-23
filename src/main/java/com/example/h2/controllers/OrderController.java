package com.example.h2.controllers;

import com.example.h2.Orders;
import com.example.h2.repostories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrdersRepository orderRepository;

    @PostMapping
    public void addOrder(@RequestBody Orders order){

        orderRepository.save(order);
    }

    @GetMapping
    public String getOrders(){
        return "found";
    }
}
