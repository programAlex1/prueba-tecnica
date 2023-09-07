package com.pruebatecnica.picpay.domain.useCase;

import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.TransferResponseDto;

public interface ITransferUseCase {

    TransferResponseDto save(TransferRequestDto transferRequestDto);
}
