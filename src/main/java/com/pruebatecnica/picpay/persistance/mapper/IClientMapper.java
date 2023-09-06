package com.pruebatecnica.picpay.persistance.mapper;

import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;
import com.pruebatecnica.picpay.persistance.entity.UserEntity;

public interface IClientMapper {

    UserEntity toEntity(UserRequestDto userRequestDto);

    UserResponseDto toDto(UserEntity userEntity);

}
