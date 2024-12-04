package com.arthur.store.models;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table (name = "TB_PAYMENT")
public class Payment implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;


    @OneToOne //relacionamento de 1 para 1 na classe dependente (pagamento depende do pedido)
    @MapsId
    private Order order; //um pagamento tem um pedido

    //constructor sem o ID que é gerado automaticamente pelo JPA
    public Payment(Instant moment, Order order) {
        this.moment = moment;
        this.order = order;
    }
    

    
}
