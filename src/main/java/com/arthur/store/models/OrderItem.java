package com.arthur.store.models;

import java.io.Serializable;

import com.arthur.store.models.pk.OrdemItemPk;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "TB_ORDER_ITEM")
public class OrderItem implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    @JsonProperty(access = Access.WRITE_ONLY)
    private OrdemItemPk id = new OrdemItemPk();

    private int quantity;
    private double price;


    public OrderItem(Order order, Products product, int quantity, double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }   

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }
}
