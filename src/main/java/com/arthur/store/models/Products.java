package com.arthur.store.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "TB_PRODUCTS")
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private String imgUrl;

    //relacionamento muitos para muitos cria uma tabela de assossiação extra
    @ManyToMany
    @JoinTable (name = "TB_PRODUCT_CATEGORY",  //nova tabela criada
               joinColumns = @JoinColumn(name = "product_id"), //chave estrangeira de products
               inverseJoinColumns = @JoinColumn(name = "category_id")) //chave estrangeira da entidade category
    private Set<Category> categories = new HashSet<>(); // garante que a coleção comece vazia mas não nula


    public Products(String name, String description, double price, String imgUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }



}
