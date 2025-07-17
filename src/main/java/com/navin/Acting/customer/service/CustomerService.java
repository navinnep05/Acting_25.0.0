package com.navin.Acting.customer.service;

import com.navin.Acting.customer.dto.CustomerUserDTO;
import com.navin.Acting.customer.entity.CustomerDetailEntity;
import com.navin.Acting.customer.entity.UserAccountEntity;
import com.navin.Acting.customer.repository.CustomerRepository;
import com.navin.Acting.customer.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    UserAccountRepository userAccountRepository;

    public List<CustomerDetailEntity> getAllCustomerList() {

        return customerRepository.findAll();
    }

    public void createCustomer(CustomerUserDTO customerUserDTO) {

        CustomerDetailEntity customerDetail = new CustomerDetailEntity();
        customerDetail.setAddress(customerUserDTO.getAddress());

        UserAccountEntity userAccount = new UserAccountEntity();
        userAccount.setCustomerId(customerDetail.getCustomerId());
    }

    public void getIndividualCustomer(Integer customerId) {

    }
}
