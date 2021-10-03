package ru.gb.product;


import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "title", length = 50)
    private String title;
    @Column(name = "price")
    private int price;

    @ManyToMany(mappedBy = "products")
    private List<Customer> customers = new ArrayList<>();

    private void customersAdd(Customer customer) {
        customers.add(customer);
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Product(long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
