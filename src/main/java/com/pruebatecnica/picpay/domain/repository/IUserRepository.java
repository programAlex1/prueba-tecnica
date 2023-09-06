package com.pruebatecnica.picpay.domain.repository;

import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;

public interface IUserRepository {

    UserResponseDto save(UserRequestDto userRequestDto);
}
