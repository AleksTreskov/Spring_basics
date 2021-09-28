//package ru.gb.repository;
//
//import org.springframework.stereotype.Repository;
//import ru.gb.domain.Product;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class ProductRepositoryNoSpringData {
//
//    private final EntityManagerFactory managerFactory;
//
//    public ProductRepositoryNoSpringData(EntityManagerFactory managerFactory) {
//        this.managerFactory = managerFactory;
//    }
//
//    public Optional<Product> findById(int id) {
//        EntityManager em = managerFactory.createEntityManager();
//
//        try {
//            return Optional.of(em.find(Product.class, id));
//        } finally {
//            em.close();
//        }
//    }
//
//    public List<Product> findAll() {
//        EntityManager em = managerFactory.createEntityManager();
//
//        try {
//            return em.createQuery("select p from Product p", Product.class).getResultList();
//        } finally {
//            em.close();
//        }
//    }
//
//    public void add(Product product) {
//        EntityManager em = managerFactory.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//            em.persist(product);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }
//    }
//
//}
