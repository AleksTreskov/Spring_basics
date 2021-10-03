package ru.gb.product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable
            (name = "customers_products",
                    joinColumns = @JoinColumn(name = "customers_id")
                    , inverseJoinColumns = @JoinColumn(name = "products_id"))
    private List<Product> products = new ArrayList<>();


    private void productsAdd(Product product) {
        products.add(product);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Customer(String name) {
        this.name = name;

    }
}
