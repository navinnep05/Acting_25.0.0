package com.navin.Acting.customer.repository;

import com.navin.Acting.customer.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetailEntity,Integer> {


    List<OrderDetailEntity> findAllByCustomerId(Integer customerId);
}
