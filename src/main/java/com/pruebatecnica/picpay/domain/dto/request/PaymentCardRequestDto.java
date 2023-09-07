package com.pruebatecnica.picpay.domain.dto.request;

import com.pruebatecnica.picpay.persistance.entity.UserEntity;
import lombok.Builder;

@Builder
public record PaymentCardRequestDto(
        double amount,
        UserEntity user

) {
}
