package com.arthur.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.store.models.Order;
import com.arthur.store.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public ResponseEntity<List<Order>> listAllOrders () {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.listAllOrders());
    }


    @GetMapping("/order/{id}")
    public ResponseEntity<Order> listOrderById (@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getOrderById(id));
    }
    
    
}
