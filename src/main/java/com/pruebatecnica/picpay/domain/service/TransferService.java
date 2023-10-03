package com.pruebatecnica.picpay.domain.service;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.TransferResponseDto;
import com.pruebatecnica.picpay.domain.repository.IPaymentCardRepository;
import com.pruebatecnica.picpay.domain.repository.ITransferRepository;
import com.pruebatecnica.picpay.domain.useCase.ITransferUseCase;
import com.pruebatecnica.picpay.persistance.entity.PaymentCardEntity;
import com.pruebatecnica.picpay.persistance.mapper.ITransferMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

@Service @RequiredArgsConstructor
public class TransferService implements ITransferUseCase {

    private final ITransferRepository itransferRepository;
    private final IPaymentCardRepository iPaymentCardRepository;
    private final RestTemplate restTemplate;

    @Override
    public TransferResponseDto save(TransferRequestDto transferRequestDto) throws Exception {

        PaymentCardEntity receiver = iPaymentCardRepository.findById(transferRequestDto.cardReceiver()).get();

        PaymentCardEntity sender =iPaymentCardRepository.findById(transferRequestDto.cardSender()).get();
        this.validateTransfer(sender,transferRequestDto.amount());

        boolean isAuthorized = this.authorized(sender,transferRequestDto.amount());
        if(!isAuthorized){
            throw new Exception("Unauthorized");
        }

        sender.setAmount(sender.getAmount().subtract(transferRequestDto.amount()));
        receiver.setAmount(receiver.getAmount().add(transferRequestDto.amount()));
        iPaymentCardRepository.save(sender);
        iPaymentCardRepository.save(receiver);
        return itransferRepository.save(transferRequestDto);
    }



    public void validateTransfer(PaymentCardEntity sender, BigDecimal amount) throws Exception {
        if(Objects.equals(sender.getUser().getRol(), "Comerciante"))
            throw new Exception("Unauthorized user");

        if(sender.getAmount().compareTo(amount) < 0)
            throw new Exception("Saldo insuficiente");


    }

    public boolean authorized(PaymentCardEntity sender,BigDecimal amount){
            ResponseEntity<Map> authorizedResponse = restTemplate.getForEntity("https://run.mocky.io/v3/8fafdd68-a090-496f-8c9a-3442cf30dae6", Map.class);
            if(authorizedResponse.getStatusCode() == HttpStatus.OK){
                String message = (String) authorizedResponse.getBody().get("message");
                return "Autorizado".equalsIgnoreCase(message);
            }else return false;

    }


}
