package com.example.qno2.controller;

import com.example.qno2.model.Product;
import com.example.qno2.repository.ProductRepository;
import com.example.qno2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    // ✅ Add this method to create a new product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PostMapping("/{id}/clone")
    public Product cloneProduct(@PathVariable Long id, @RequestParam String color) {
        return productService.cloneProduct(id, color);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
