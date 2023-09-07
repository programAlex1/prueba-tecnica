package com.pruebatecnica.picpay.domain.dto.request;

public record TransferRequestDto(
        double amount,
        Long cardSender,
        Long cardReceiver
) {
}
