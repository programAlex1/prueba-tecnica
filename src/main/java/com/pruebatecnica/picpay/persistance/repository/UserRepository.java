package com.pruebatecnica.picpay.persistance.repository;

import com.pruebatecnica.picpay.domain.dto.request.UserRequestDto;
import com.pruebatecnica.picpay.domain.dto.response.UserResponseDto;
import com.pruebatecnica.picpay.domain.repository.IUserRepository;
import com.pruebatecnica.picpay.persistance.crud.IUserCrudRepository;
import com.pruebatecnica.picpay.persistance.entity.UserEntity;
import com.pruebatecnica.picpay.persistance.mapper.IClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository @RequiredArgsConstructor
public class UserRepository implements IUserRepository {

    private final IUserCrudRepository iUserCrudRepository;
    private final IClientMapper iClientMapper;

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        UserEntity entity =iUserCrudRepository.save(iClientMapper.toEntity(userRequestDto));
        return iClientMapper.toDto(entity);
    }
}
