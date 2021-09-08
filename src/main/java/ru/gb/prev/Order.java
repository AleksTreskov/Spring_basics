package ru.gb.prev;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private float cost;

    public Order() {
    }

    public Order(int id, LocalDate date, float cost, List<Product> products) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", cost=" + cost +
                ", products=" + products +
                '}';
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public float getCost() {
        return cost;
    }

    public List<Product> getProducts() {
        return products;
    }

    private List<Product> products;
}
