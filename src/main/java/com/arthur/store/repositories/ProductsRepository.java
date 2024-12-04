package com.arthur.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arthur.store.models.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    
}
