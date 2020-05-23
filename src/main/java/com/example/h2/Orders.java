package com.example.h2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Orders() {
    }

    public Orders(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
