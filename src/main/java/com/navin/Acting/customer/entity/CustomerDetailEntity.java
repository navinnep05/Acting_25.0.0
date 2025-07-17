package com.navin.Acting.customer.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "customer_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDetailEntity {

    @Id
    private Integer customerId;

    @NotBlank
    private String firstName;
    @NotBlank
    private  String lastName;

    private String gender;

    @NotBlank
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String phoneNumber;

    @Email
    @NotBlank
    private String email;

    @Column(length = 1000)
    private String address ;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId",referencedColumnName = "customerId",updatable = false,insertable = false)
    private List<VehicleDetailsEntity> vehicleDetailsList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId",referencedColumnName = "customerId",updatable = false,insertable = false)
    private List<OrderDetailEntity> orderDetailsList;
}
