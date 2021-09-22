package ru.gb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.gb.domain.Product;
import ru.gb.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return products;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product findById(@PathVariable int id) throws Exception {
        return repository.findById(id).orElseThrow(Exception::new);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void delete(@PathVariable int id) {
         repository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Product> save(@RequestBody Product product) {
        repository.save(product);

        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return products;
    }

}
