package com.arthur.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.store.models.Order;
import com.arthur.store.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;


    //listar todos os usuários
    public List<Order> listAllOrders(){
        return orderRepository.findAll();
    }

    //mostrar o usuário pelo ID
    public Order getOrderById(Long id){
        Optional <Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
