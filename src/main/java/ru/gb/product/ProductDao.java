package ru.gb.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductDao extends CrudRepository<Product,Long> {
//    private final EntityManagerFactory entityManagerFactory;
//
//    public ProductDao(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    public Optional<Product> findById(int id) {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        try {
//            return Optional.of(em.find(Product.class, id));
//        } finally {
//            em.close();
//        }
//    }
//
//    public List<Product> findAll() {
//        EntityManager em = entityManagerFactory.createEntityManager();
//        try {
//            return em.createQuery("select product from Product product").getResultList();
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
//}
}