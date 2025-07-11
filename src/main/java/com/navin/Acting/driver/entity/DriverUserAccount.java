package com.navin.Acting.driver.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "driver_userAccount")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DriverUserAccount {

    @Id
    private Integer userId;

    private String password;

    @Email
    private String email;

    private Integer driverId;

    private Boolean isActive;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driverId",referencedColumnName = "driverId",insertable = false,updatable = false)
    private DriverDetailEntity driverDetail;

}
