package com.navin.Acting.customer.controller;

import com.navin.Acting.customer.entity.VehicleDetailsEntity;
import com.navin.Acting.customer.service.VehicleService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping("/create")
    public ResponseEntity<String> createVehicle(@Valid @RequestBody VehicleDetailsEntity vehicleDetail)
    {
        vehicleService.createVehicle(vehicleDetail);
        return ResponseEntity.ok("created successfully");
    }

    @GetMapping("/getVehicle/{customerId}")
    public List<VehicleDetailsEntity> getCustomerVehicle(@PathVariable("customerId") Integer customerId)
    {
       return vehicleService.getCustomerVehicle(customerId);
    }

    @GetMapping("/individualVehicle/{vehicleId}")
    public VehicleDetailsEntity getIndividual(@PathVariable Integer vehicleId)
    {
        return vehicleService.getIndividual(vehicleId).orElseThrow(()->new EntityNotFoundException("Vehicle Not found"));
    }

}
