package ru.gb.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerDao extends CrudRepository<Customer,Long> {
//    private final EntityManagerFactory entityManagerFactory;
//
//    public CustomerDao(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    public Optional<Customer> findById(int id) {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        try {
//            return Optional.of(em.find(Customer.class, id));
//        } finally {
//            em.close();
//        }
//    }
//
//    public List<Product> findAll() {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        try {
//            return em.createQuery("select customer from Customer customer").getResultList();
//        } finally {
//            em.close();
//        }
//    }
//
//    public void deleteById(int id) {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        try {
//            em.getTransaction().begin();
//            em.remove(findById(id));
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//    }
//
//    public void saveOrUpdate(Product product) {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        try {
//            em.getTransaction().begin();
//            em.persist(product);
//            em.getTransaction().commit();
//
//        } finally {
//            em.close();
//        }
//    }
}
