package com.pruebatecnica.picpay.domain.dto.request;

import java.math.BigDecimal;

public record TransferRequestDto(
        BigDecimal amount,
        Long cardSender,
        Long cardReceiver
) {
}
