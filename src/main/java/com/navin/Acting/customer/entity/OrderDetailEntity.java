package com.navin.Acting.customer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "order_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailEntity {

    @Id
    private Integer orderId;

    private LocalDateTime orderDate;

    private String startingLocation;
    private String endingLocation;

    private Integer customerId;
    private Integer driverId; // comes from DriverAPP once status booked

    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId",referencedColumnName = "customerId",updatable = false,insertable = false)
    private CustomerDetailEntity customerDetailList;
}
