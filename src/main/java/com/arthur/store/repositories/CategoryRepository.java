package com.arthur.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.store.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
