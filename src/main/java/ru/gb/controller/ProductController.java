package ru.gb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.domain.Client;
import ru.gb.domain.Product;
import ru.gb.repository.ProductRepository;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/products")
@RestController
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable long id) {
        return repository.findById((int) id);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable long id) {
        repository.deleteById((int) id);
        return HttpStatus.OK.value();
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        Product newProduct = repository.save(product);
        return ResponseEntity.created(URI.create("/products/" + newProduct.getId())).body(newProduct);
    }

}
