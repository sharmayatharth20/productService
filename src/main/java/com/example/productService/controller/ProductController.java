package com.example.productService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public String getProducts() {
        return "List of products!";
    }
}
