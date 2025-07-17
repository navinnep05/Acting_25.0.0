package com.navin.Acting.customer.controller;

import com.navin.Acting.customer.dto.CustomerUserDTO;
import com.navin.Acting.customer.entity.CustomerDetailEntity;
import com.navin.Acting.customer.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<CustomerDetailEntity> getAllCustomers()
    {
        return  customerService.getAllCustomerList();
    }

    @PostMapping("/createCustomer")
    public void createCustomer(@Valid @RequestBody CustomerUserDTO customerUserDTO)
    {
        customerService.createCustomer(customerUserDTO);
    }
    @GetMapping("/individualCustomer/{customerId}")
    public void individualCustomer(@PathVariable ("customerId")Integer customerId)
    {
        customerService.getIndividualCustomer(customerId);
    }
}
