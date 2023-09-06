package com.pruebatecnica.picpay.persistance.mapper;


import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;
import com.pruebatecnica.picpay.persistance.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper implements IClientMapper{
    @Override
    public UserEntity toEntity(UserRequestDto userRequestDto) {
        return UserEntity.builder()
                .fullName(userRequestDto.fullName())
                .rol(userRequestDto.rol())
                .cpf(userRequestDto.cpf())
                .password(userRequestDto.password())
                .email(userRequestDto.email())
                .build();
    }

    @Override
    public UserResponseDto toDto(UserEntity userEntity) {
        return UserResponseDto.builder()
                .id(userEntity.getId())
                .password(userEntity.getPassword())
                .cpf(userEntity.getCpf())
                .fullName(userEntity.getFullName())
                .password(userEntity.getPassword())
                .email(userEntity.getEmail())
                .build();
    }
}
