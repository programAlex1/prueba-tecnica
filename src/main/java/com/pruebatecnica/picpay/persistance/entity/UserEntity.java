package com.pruebatecnica.picpay.persistance.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity @NoArgsConstructor @AllArgsConstructor
@Getter @Setter @Builder
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_completo", nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String email;
    @Column(name = "contrasenia",nullable = false)
    private String password;
    @Column(nullable = false)
    private String rol;
    @OneToOne(mappedBy = "user")
    private PaymentCardEntity card;
}


