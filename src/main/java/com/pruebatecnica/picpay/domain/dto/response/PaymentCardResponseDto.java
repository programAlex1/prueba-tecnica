package com.pruebatecnica.picpay.domain.dto.response;

import lombok.Builder;


@Builder
public record PaymentCardResponseDto(

        Long id,
        double amount

) {
}
