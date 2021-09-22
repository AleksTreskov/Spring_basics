package ru.gb.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "CLIENTS")
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Product> products;
}
