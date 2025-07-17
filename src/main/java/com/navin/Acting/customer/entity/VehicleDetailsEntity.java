package com.navin.Acting.customer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "vehicle_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDetailsEntity {

    @Id
    private  Integer vehicleId;

    @Column(unique = true,nullable = false)
    private  String vehicleNo;

    @Column(nullable = false)
    private Integer customerId;

    private String vehicleModel;
    private String ownerName;
    private String fc;
    private  String insurance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId",referencedColumnName = "customerId",updatable = false,insertable = false)
    private CustomerDetailEntity customerDetailList;
}
