package com.pruebatecnica.picpay.domain.dto.request;

import com.pruebatecnica.picpay.persistance.entity.UserEntity;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record PaymentCardRequestDto(

        Long id,
        BigDecimal amount,
        UserEntity user

) {
}
