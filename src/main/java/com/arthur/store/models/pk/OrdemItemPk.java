package com.arthur.store.models.pk;

import java.io.Serializable;

import com.arthur.store.models.Order;
import com.arthur.store.models.Products;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//@Embeddable indica que a classe pode ser incorporada em uma entidade.
//Seus atributos são incluídos na tabela da entidade que a incorpora, e não criam uma tabela separada.
@Embeddable
public class OrdemItemPk implements Serializable{ 
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn (name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn (name = "product_id")
    private Products product;


}
