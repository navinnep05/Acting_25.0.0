package com.navin.Acting.driver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "driver_availability")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DriverAvailabilityEntity {


    @Id
    private Integer driverAvailableId;

    private LocalDateTime availableDate;
   // private Integer orderId;  //from customer project
    private Integer driverId;
    private Boolean isAvailable;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "driverId", referencedColumnName = "driverId" ,insertable = false,updatable = false)
    private DriverDetailEntity driverDetail;
}
