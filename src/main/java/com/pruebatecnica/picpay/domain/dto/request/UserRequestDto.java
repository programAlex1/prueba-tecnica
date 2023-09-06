package com.pruebatecnica.picpay.domain.dto.request;

import jakarta.validation.constraints.*;
import lombok.Builder;

@Builder
public record UserRequestDto(
        @NotEmpty @NotBlank String fullName,
        @NotBlank @NotEmpty String cpf,
        @Email(message = "The email format is incorrect") String email,
        @Size(min = 8 , message = "The password must be at least 8 characters long") @Size(max = 14) String password,
        @NotEmpty @NotBlank String rol
) {
}
