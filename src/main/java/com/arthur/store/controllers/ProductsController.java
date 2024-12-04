package com.arthur.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.store.models.Products;
import com.arthur.store.services.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductsController {
    
    @Autowired
    private ProductsService productService;

    @GetMapping("/product")
    public ResponseEntity<List<Products>> listAllProducts () {
        return ResponseEntity.status(HttpStatus.OK).body(productService.listAllProducts());
    }


    @GetMapping("/product/{id}")
    public ResponseEntity<Products> listProductsById (@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProductsById(id));
    }
    
    
}
