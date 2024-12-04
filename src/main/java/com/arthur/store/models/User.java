package com.arthur.store.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//utilizando o Lombok para gerar os getters, setters e constructors
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table (name = "TB_USER")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String password;

    @OneToMany (mappedBy = "client")
    //@JsonManagedReference // Esta anotação gerencia a serialização do lado "1" (User)
    @JsonIgnoreProperties("client") // Ignora a serialização do campo 'client' dentro da ordem para evitar o loop
    private List<Order> orders = new ArrayList<>();// relacionamento com a tabela TB_ORDER


    // Construtor sem o 'id', que é gerado automaticamente pelo JPA
    public User(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
