package com.navin.Acting.customer.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "user_account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountEntity {

    @Id
    private Integer userId;

    private String password;

    @Email
    private String email;

    private Integer customerId;

    private Boolean isActive;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId",referencedColumnName = "customerId",insertable = false,updatable = false)
    private CustomerDetailEntity customerDetail;
}
