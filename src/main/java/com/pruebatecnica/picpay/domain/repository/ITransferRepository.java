package com.pruebatecnica.picpay.domain.repository;

import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.TransferResponseDto;

public interface ITransferRepository {

    TransferResponseDto save(TransferRequestDto transferRequestDto);
}
