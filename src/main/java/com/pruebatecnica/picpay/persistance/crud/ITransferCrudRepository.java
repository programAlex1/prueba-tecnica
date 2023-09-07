package com.pruebatecnica.picpay.persistance.crud;

import com.pruebatecnica.picpay.persistance.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransferCrudRepository extends JpaRepository<TransferEntity,Long> {
}
