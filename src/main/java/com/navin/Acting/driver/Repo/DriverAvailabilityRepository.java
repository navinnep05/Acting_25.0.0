package com.navin.Acting.driver.Repo;

import com.navin.Acting.driver.entity.DriverAvailabilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverAvailabilityRepository extends JpaRepository<DriverAvailabilityEntity,Integer> {
}
