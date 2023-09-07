package com.pruebatecnica.picpay.controller;


import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.TransferResponseDto;
import com.pruebatecnica.picpay.domain.useCase.ITransferUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/transfers")
public class TransferController {

    private final ITransferUseCase iTransferUseCase;
    @PostMapping
    public ResponseEntity<TransferResponseDto> save(@RequestBody TransferRequestDto transferRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(iTransferUseCase.save(transferRequestDto));
    }
}
