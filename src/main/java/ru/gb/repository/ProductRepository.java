package ru.gb.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ru.gb.domain.Client;
import ru.gb.domain.Product;
@Service
public interface ProductRepository extends CrudRepository<Product, Integer> {
    Iterable<Product> findAllByClient(Client client);
    Iterable<Product> findAllByClientAndPrice(Client client, float price);
    @Query("select p from Product p where p.name = :name")
    Iterable<Product> findByName(@Param("name") String name);
    @Query(value = "SELECT * FROM products as p WHERE p.name = :name", nativeQuery = true)
    Iterable<Product> findByNameNativeSQL(@Param("name") String name);
}
