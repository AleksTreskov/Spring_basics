package ru.gb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Product name cannot be blank")
    private String name;
    private float price;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = true)
    private Client client;

    public Product() {
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Client getClient() {
        return client;
    }
}
