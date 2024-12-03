package com.arthur.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.store.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
