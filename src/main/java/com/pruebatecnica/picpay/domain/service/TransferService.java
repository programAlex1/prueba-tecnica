package com.pruebatecnica.picpay.domain.service;

import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.TransferResponseDto;
import com.pruebatecnica.picpay.domain.repository.IPaymentCardRepository;
import com.pruebatecnica.picpay.domain.repository.ITransferRepository;
import com.pruebatecnica.picpay.domain.useCase.ITransferUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class TransferService implements ITransferUseCase {

    private final ITransferRepository itransferRepository;
    private final IPaymentCardRepository iPaymentCardRepository;

    @Override
    public TransferResponseDto save(TransferRequestDto transferRequestDto) {

        iPaymentCardRepository.findById(transferRequestDto.cardReceiver())
                .ifPresent(card ->
                                   iPaymentCardRepository.updateAmount(card.id(),transferRequestDto.amount())
                );



        return itransferRepository.save(transferRequestDto);
    }
}
