package com.example.qno2.service;

import com.example.qno2.model.Product;
import com.example.qno2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product cloneProduct(Long productId, String newColor) {
        Optional<Product> existingProductOpt = productRepository.findById(productId);
        if (existingProductOpt.isPresent()) {
            Product original = existingProductOpt.get();
            Product clonedProduct = original.clone();
            clonedProduct.setId(null); // Avoid duplicating primary key
            clonedProduct.setColor(newColor);
            return productRepository.save(clonedProduct);
        } else {
            throw new RuntimeException("Product not found with ID: " + productId);
        }
    }
}
