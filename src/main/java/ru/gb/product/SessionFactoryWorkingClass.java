package ru.gb.product;

import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class SessionFactoryWorkingClass {
    public void start() {
        EntityManagerFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        Product product1 = new Product("Bakery", 34);
        Product product2 = new Product("Bacon", 40);

        entityManager.persist(product1);
        entityManager.persist(product2);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        Customer customer1 = new Customer("Paul");

        entityManager.persist(customer1);
        entityManager.getTransaction().commit();

        Product product = entityManager.find(Product.class, (long) 1);
        Product anotherProduct = entityManager.find(Product.class, (long) 2);
        System.out.println(product+"\n"+anotherProduct);


    }
}
