package com.navin.Acting.customer.controller;


import com.navin.Acting.customer.entity.OrderDetailEntity;
import com.navin.Acting.customer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/customerOrder/{customerId}")
    public List<OrderDetailEntity> getCustomerOrderDetail(@PathVariable("customerId") Integer customerId)
    {
        return orderService.getCustomerOrders(customerId);
    }

    @PostMapping("/createOrder")
    public void createOrder(@RequestBody OrderDetailEntity orderDetail)
    {
        orderService.createOrders(orderDetail);
    }
}
