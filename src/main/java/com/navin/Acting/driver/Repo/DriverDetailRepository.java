package com.navin.Acting.driver.Repo;


import com.navin.Acting.driver.entity.DriverDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverDetailRepository  extends JpaRepository<DriverDetailEntity,Integer> {
}
