package com.example.h2.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private String orderId;
    private Instant createdDate;

    @Embedded
    private Address address;


    public Order() {
    }

    public Order(String orderId, Instant createdDate, Address address) {
        this.orderId = orderId;
        this.createdDate = createdDate;
        this.address = address;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", createdDate=" + createdDate +
                ", address=" + address +
                '}';
    }
}
