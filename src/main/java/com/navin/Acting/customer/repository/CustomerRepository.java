package com.navin.Acting.customer.repository;

import com.navin.Acting.customer.entity.CustomerDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetailEntity,Integer> {
}
