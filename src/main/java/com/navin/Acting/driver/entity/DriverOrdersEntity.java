package com.navin.Acting.driver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "driver_orders")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DriverOrdersEntity {

    @EmbeddedId
    private DriverOrderId driverOrderId; //driverId,orderId

    private LocalDateTime driverOrderDate;
    
    private String orderStatus;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("driverId")
    @JoinColumn(name = "driverId",referencedColumnName = "driverId",insertable = false,updatable = false)
    private DriverDetailEntity driverDetail;

    // while order booked for furture date should update in driveravaliblity status too

}
