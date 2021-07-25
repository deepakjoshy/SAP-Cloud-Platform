package com.example.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * demo
 */
@Entity
@Table
public class demo {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    public demo(){}

    public demo(int id, String name) {
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
        return "demo [id=" + id + ", name=" + name + "]";
    }
    
    
}