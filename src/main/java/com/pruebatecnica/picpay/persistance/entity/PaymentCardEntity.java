package com.pruebatecnica.picpay.persistance.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tarjeta")
public class PaymentCardEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto",nullable = false)
    private BigDecimal amount;

    @OneToOne()
    @JoinColumn(name = "id_user")
    private UserEntity user;

}
