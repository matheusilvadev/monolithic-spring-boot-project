package com.gprmono.gpr.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;


    public enum StatusPedido {
        EM_ANDAMENTO, PRONTO, ENTREGUE
    }
}
