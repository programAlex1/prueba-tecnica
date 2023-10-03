package com.pruebatecnica.picpay.persistance.repository;

import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.TransferResponseDto;
import com.pruebatecnica.picpay.domain.repository.ITransferRepository;
import com.pruebatecnica.picpay.persistance.crud.ITransferCrudRepository;
import com.pruebatecnica.picpay.persistance.mapper.ITransferMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository @RequiredArgsConstructor
public class TransferRepository implements ITransferRepository {

    private final ITransferMapper transferMapper;

    private final ITransferCrudRepository iTransferCrudRepository;
    @Override
    public TransferResponseDto save(TransferRequestDto transferRequestDto) {
        iTransferCrudRepository.save(transferMapper.toEntity(transferRequestDto));
        return new TransferResponseDto("Exitosa");
    }
}
