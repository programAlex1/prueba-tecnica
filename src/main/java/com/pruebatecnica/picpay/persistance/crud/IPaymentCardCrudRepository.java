package com.pruebatecnica.picpay.persistance.crud;

import com.pruebatecnica.picpay.persistance.entity.PaymentCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface IPaymentCardCrudRepository extends JpaRepository<PaymentCardEntity,Long> {

    @Modifying
    @Transactional
    @Query("UPDATE PaymentCardEntity b SET b.amount = b.amount + CAST(:amount AS DOUBLE) WHERE b.id = :id")
    void updateAmount(Long id, double amount);
}
