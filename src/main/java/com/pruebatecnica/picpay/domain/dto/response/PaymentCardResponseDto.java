package com.pruebatecnica.picpay.domain.dto.response;

import lombok.Builder;

import java.math.BigDecimal;


@Builder
public record PaymentCardResponseDto(

        Long id,
        BigDecimal amount

) {
}
