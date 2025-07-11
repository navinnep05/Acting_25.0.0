package com.navin.Acting.driver.Repo;


import com.navin.Acting.driver.entity.DriverOrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverOrderRepository extends JpaRepository<DriverOrdersEntity,Integer> {
}
