package com.arthur.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.store.models.User;
import com.arthur.store.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;


    //listar todos os usuários
    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    //mostrar o usuário pelo ID
    public User getUserById(Long id){
        Optional <User> obj = userRepository.findById(id);
        return obj.get();
    }
}
