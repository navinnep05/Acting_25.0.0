package com.navin.Acting.driver.entity;

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
@Table(name = "driver_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DriverDetailEntity {
    @Id
    private Integer driverId;

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


    @OneToMany(mappedBy = "driverDetail", fetch = FetchType.LAZY)
    private List<DriverAvailabilityEntity> availabilityList;

    @OneToMany(mappedBy = "driverDetail",fetch = FetchType.LAZY)
    private List<DriverOrdersEntity> driverOrdersList ;

}
