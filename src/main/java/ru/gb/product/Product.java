package ru.gb.product;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name", length = 50)
    private String title;
    @Column(name = "surname")
    private int price;


    public long getId() {
        return id;
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
