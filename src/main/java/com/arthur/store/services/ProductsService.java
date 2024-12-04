package com.arthur.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.store.models.Products;
import com.arthur.store.repositories.ProductsRepository;

@Service
public class ProductsService {
    
    @Autowired
    private ProductsRepository productsRepository;


    //listar todos os usuários
    public List<Products> listAllProducts(){
        return productsRepository.findAll();
    }

    //mostrar o usuário pelo ID
    public Products getProductsById(Long id){
        Optional <Products> obj = productsRepository.findById(id);
        return obj.get();
    }
}
