package com.navin.Acting.customer.service;

import com.navin.Acting.customer.entity.OrderDetailEntity;
import com.navin.Acting.customer.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;


    public List<OrderDetailEntity> getCustomerOrders(Integer customerId) {
        List<OrderDetailEntity> customerOrders = orderRepository.findAllByCustomerId(customerId);
        return customerOrders;
    }

    public void createOrders(OrderDetailEntity orderDetail) {
        orderRepository.save(orderDetail);
    }
}
