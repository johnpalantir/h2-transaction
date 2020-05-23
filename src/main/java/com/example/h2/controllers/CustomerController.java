package com.example.h2.controllers;

import com.example.h2.model.Customer;
import com.example.h2.repostories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public void save(@RequestBody Customer customer) {

        customerRepository.save(customer);
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable String id) {

        return customerRepository.findById(Integer.valueOf(id));

    }

    @GetMapping
    public String getOrders() {
        return "found";
    }
}
