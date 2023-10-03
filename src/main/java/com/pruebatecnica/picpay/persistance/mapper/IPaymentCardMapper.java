package com.pruebatecnica.picpay.persistance.mapper;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.PaymentCardResponseDto;
import com.pruebatecnica.picpay.persistance.entity.PaymentCardEntity;

public interface IPaymentCardMapper {

    PaymentCardEntity toEntity(PaymentCardRequestDto paymentCardRequestDto);

    PaymentCardRequestDto toDtoRequest(PaymentCardEntity card);

    PaymentCardResponseDto toDto(PaymentCardEntity card);




}
