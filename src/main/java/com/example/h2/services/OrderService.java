package com.example.h2.services;

import com.example.h2.model.Order;

import java.util.List;

public interface OrderService {
    void save(Order order);

    List<Order> findAll();

}
