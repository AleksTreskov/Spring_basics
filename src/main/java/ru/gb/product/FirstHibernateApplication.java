package ru.gb.product;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class FirstHibernateApplication {
    public static void main(String[] args) {
        EntityManagerFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        Product newProduct = new Product("Bakery",34);
        entityManager.persist(newProduct);
        entityManager.getTransaction().commit();

        Product student = entityManager.find(Product.class, (long)1);
        System.out.println(student);

    }
}
