package com.pruebatecnica.picpay.domain.useCase;

import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;

public interface IUserUseCase {

    UserResponseDto save(UserRequestDto userRequestDto);
}
