package com.pruebatecnica.picpay.persistance.mapper;

import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.persistance.entity.PaymentCardEntity;
import com.pruebatecnica.picpay.persistance.entity.TransferEntity;
import org.springframework.stereotype.Component;


@Component
public class TransferMapper implements ITransferMapper{
    @Override
    public TransferEntity toEntity(TransferRequestDto transferRequestDto) {
        PaymentCardEntity sender = new PaymentCardEntity();
        sender.setId(transferRequestDto.cardSender());
        PaymentCardEntity receiver = new PaymentCardEntity();
        receiver.setId(transferRequestDto.cardReceiver());
        return TransferEntity.builder()
                .amount(transferRequestDto.amount())
                .cardSender(sender)
                .cardReceiver(receiver)
                .build();
    }
}
