package com.navin.Acting.customer.service;

import com.navin.Acting.customer.entity.VehicleDetailsEntity;
import com.navin.Acting.customer.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public void createVehicle(VehicleDetailsEntity vehicleDetail) {
        vehicleRepository.save(vehicleDetail);

    }

    public List<VehicleDetailsEntity> getCustomerVehicle(Integer customerId) {
       List<VehicleDetailsEntity> vehicleDetail= vehicleRepository.findAllByCustomerId(customerId);

      return vehicleDetail;
    }

    public Optional<VehicleDetailsEntity> getIndividual(Integer vehicleId) {
        Optional<VehicleDetailsEntity> vehicleDetails =vehicleRepository.findByVehicleId(vehicleId);
        return vehicleDetails;
    }
}
