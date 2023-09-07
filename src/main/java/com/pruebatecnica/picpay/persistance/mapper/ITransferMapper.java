package com.pruebatecnica.picpay.persistance.mapper;

import com.pruebatecnica.picpay.domain.dto.request.TransferRequestDto;
import com.pruebatecnica.picpay.persistance.entity.TransferEntity;

public interface ITransferMapper {

    TransferEntity toEntity(TransferRequestDto transferRequestDto);
}
