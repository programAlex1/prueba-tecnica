package com.pruebatecnica.picpay.persistance.repository;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;
import com.pruebatecnica.picpay.domain.repository.IUserRepository;
import com.pruebatecnica.picpay.persistance.crud.IPaymentCardCrudRepository;
import com.pruebatecnica.picpay.persistance.crud.IUserCrudRepository;
import com.pruebatecnica.picpay.persistance.entity.UserEntity;
import com.pruebatecnica.picpay.persistance.mapper.IClientMapper;
import com.pruebatecnica.picpay.persistance.mapper.IPaymentCardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository @RequiredArgsConstructor
public class UserRepository implements IUserRepository {

    private final IUserCrudRepository iUserCrudRepository;
    private final IClientMapper iClientMapper;
    private final IPaymentCardCrudRepository iPaymentCardCrudRepository;
    private final IPaymentCardMapper iPaymentCardMapper;

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        UserEntity entity =iUserCrudRepository.save(iClientMapper.toEntity(userRequestDto));

        PaymentCardRequestDto dto = new PaymentCardRequestDto(0.0,entity);
        iPaymentCardCrudRepository.save(iPaymentCardMapper.toEntity(dto));
        return iClientMapper.toDto(entity);
    }
}
