package com.pruebatecnica.picpay.persistance.mapper;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.PaymentCardResponseDto;
import com.pruebatecnica.picpay.persistance.entity.PaymentCardEntity;
import org.springframework.stereotype.Component;

@Component
public class IPaymentCardMapperImpl implements IPaymentCardMapper {
    @Override
    public PaymentCardEntity toEntity(PaymentCardRequestDto paymentCardRequestDto) {
        return PaymentCardEntity.builder()
                .amount(paymentCardRequestDto.amount())
                .user(paymentCardRequestDto.user())
                .build();
    }

    @Override
    public PaymentCardRequestDto toDtoRequest(PaymentCardEntity card) {
        return PaymentCardRequestDto.builder()
                .amount(card.getAmount())
                .user(card.getUser())
                .id(card.getId())
                .build();
    }

    @Override
    public PaymentCardResponseDto toDto(PaymentCardEntity card) {
        return PaymentCardResponseDto.builder()
                .id(card.getId())
                .amount(card.getAmount())
                .build();
    }
}
