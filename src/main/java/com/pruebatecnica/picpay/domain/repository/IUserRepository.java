package com.pruebatecnica.picpay.domain.repository;

import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;

import java.util.Optional;

public interface IUserRepository {

    UserResponseDto save(UserRequestDto userRequestDto);

    Optional<UserResponseDto> findById(Long id);
}
