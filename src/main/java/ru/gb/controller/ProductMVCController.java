package ru.gb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.gb.domain.Product;
import ru.gb.repository.ProductRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products/mvc")
public class ProductMVCController {
    private final ProductRepository repository;

    public ProductMVCController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String findAll(Model model) {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        model.addAttribute("products", repository.findAll());

        return "products";
    }

    @GetMapping("/form")
    public String saveForm(Product product) {
//      model.addAttribute("product", new Product());
        return "product-add";
    }

    @PostMapping
    public String save(@Valid Product product) {
        repository.save(product);
        return "redirect:/products/mvc";
    }
    @DeleteMapping
    public String delete(@Valid Product product){
        repository.delete(product);
        return "redirect:/products/mvc";
    }
}
