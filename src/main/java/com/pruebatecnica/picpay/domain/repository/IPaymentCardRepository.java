package com.pruebatecnica.picpay.domain.repository;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.persistance.entity.PaymentCardEntity;

import java.util.Optional;

public interface IPaymentCardRepository {

        void save(PaymentCardEntity paymentCardRequestDto);

        Optional<PaymentCardEntity> findById(Long id);


}
