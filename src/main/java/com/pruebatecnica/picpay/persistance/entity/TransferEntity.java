package com.pruebatecnica.picpay.persistance.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Builder @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class TransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "monto",nullable = false)
    private double amount;
    @ManyToOne()
    @JoinColumn(name = "emisor")
    private PaymentCardEntity cardSender;

    @ManyToOne()
    @JoinColumn(name = "receptor")
    private PaymentCardEntity cardReceiver;
}
