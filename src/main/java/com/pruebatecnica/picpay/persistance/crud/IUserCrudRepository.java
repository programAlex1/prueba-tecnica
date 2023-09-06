package com.pruebatecnica.picpay.persistance.crud;

import com.pruebatecnica.picpay.persistance.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserCrudRepository extends JpaRepository<UserEntity,Long> {
}
