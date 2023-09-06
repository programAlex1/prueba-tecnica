package com.pruebatecnica.picpay.domain.dto.response;

import lombok.Builder;

@Builder
public record UserResponseDto(

        Long id,
        String fullName,
        String cpf,
        String email,
        String password,
        String rol
){

}
