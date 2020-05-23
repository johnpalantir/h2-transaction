package com.example.h2.controllers;

import com.example.h2.services.OrderService;
import com.example.h2.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.h2.constants.OrderConstant.ORDERS;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public void save(@RequestBody Order order){
        orderService.save(order);
    }

    @GetMapping
    public List<Order> getAll(){
        return orderService.findAll();
    }
}
