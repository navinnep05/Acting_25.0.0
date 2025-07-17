package com.navin.Acting.customer.repository;

import com.navin.Acting.customer.entity.VehicleDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleDetailsEntity,Integer> {
    Optional<VehicleDetailsEntity> findByVehicleId(Integer vehicleId);

    List<VehicleDetailsEntity> findAllByCustomerId(Integer customerId);
}
