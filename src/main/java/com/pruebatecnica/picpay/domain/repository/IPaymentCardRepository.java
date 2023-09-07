package com.pruebatecnica.picpay.domain.repository;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.PaymentCardResponseDto;

import java.util.Optional;

public interface IPaymentCardRepository {

        void save(PaymentCardRequestDto paymentCardRequestDto);

        Optional<PaymentCardResponseDto> findById(Long id);

        void updateAmount(Long id, double amount);
}
