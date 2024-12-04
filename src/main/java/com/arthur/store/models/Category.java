package com.arthur.store.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "TB_CATEGORY")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Transient
    private Set<Products> product = new HashSet<>();

    // Construtor sem o 'id', que é gerado automaticamente pelo JPA
    public Category(String name) {
        this.name = name;
    }

}
