package com.arthur.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.store.models.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
