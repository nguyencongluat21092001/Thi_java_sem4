package com.example.model;

import javax.persistence.*;
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;

    @Column(name="name")
    protected String name;

    @Column(name="price")
    protected int price;

    @Column(name="amount")
    protected int amount;

    @Column(name="details")
    protected String details;

    public Product() {
    }

    public Product(String name, int price   , int amount , String details) {
        super();
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.details =details;
    }

    public Product(int id, String name, int price   , int amount , String details) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.details = details;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    public  void  setAmount(int amount) {this.amount = amount;}
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}


