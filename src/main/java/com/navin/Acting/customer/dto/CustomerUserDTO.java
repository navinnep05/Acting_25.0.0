package com.navin.Acting.customer.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerUserDTO {


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


    private String password;
    private Boolean isActive;
}
