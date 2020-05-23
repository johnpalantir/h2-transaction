package com.example.h2.services;

import com.example.h2.model.Order;
import com.example.h2.repostories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public void save(Order order) {
        order.setOrderId(UUID.randomUUID().toString());
        order.setCreatedDate(Instant.now());
        repository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }
}
