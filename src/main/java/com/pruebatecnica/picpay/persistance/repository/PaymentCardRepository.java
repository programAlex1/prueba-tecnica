package com.pruebatecnica.picpay.persistance.repository;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.PaymentCardResponseDto;
import com.pruebatecnica.picpay.domain.repository.IPaymentCardRepository;
import com.pruebatecnica.picpay.persistance.crud.IPaymentCardCrudRepository;
import com.pruebatecnica.picpay.persistance.entity.PaymentCardEntity;
import com.pruebatecnica.picpay.persistance.mapper.IPaymentCardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class PaymentCardRepository implements IPaymentCardRepository {

    private final IPaymentCardMapper iPaymentCardMapper;
    private final IPaymentCardCrudRepository iPaymentCardCrudRepository;
    @Override
    public void save(PaymentCardEntity paymentCardRequestDto) {
        iPaymentCardCrudRepository.save(paymentCardRequestDto);
    }

    @Override
    public Optional<PaymentCardEntity> findById(Long id) {
        return iPaymentCardCrudRepository.findById(id);
    }


}
