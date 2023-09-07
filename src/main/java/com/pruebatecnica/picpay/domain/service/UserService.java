package com.pruebatecnica.picpay.domain.service;

import com.pruebatecnica.picpay.domain.dto.request.PaymentCardRequestDto;
import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;
import com.pruebatecnica.picpay.domain.repository.IPaymentCardRepository;
import com.pruebatecnica.picpay.domain.repository.IUserRepository;
import com.pruebatecnica.picpay.domain.useCase.IUserUseCase;
import com.pruebatecnica.picpay.persistance.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service @RequiredArgsConstructor
public class UserService implements IUserUseCase {

    private final IUserRepository userRepository;

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        if(Objects.isNull(userRequestDto))
            throw new RuntimeException("The customer cannot be null");

        return  userRepository.save(userRequestDto);
    }
}
