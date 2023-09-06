package com.pruebatecnica.picpay.controller;


import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;
import com.pruebatecnica.picpay.domain.useCase.IUserUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.pruebatecnica.picpay.constants.UserConstants.BASE_URI;
@RestController
@RequestMapping(value = BASE_URI )
@RequiredArgsConstructor
public class UserController {

    private final IUserUseCase iUserUseCase;
    @PostMapping()
    public ResponseEntity<UserResponseDto> save(@RequestBody @Valid UserRequestDto userRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(iUserUseCase.save(userRequestDto));
    }
}
