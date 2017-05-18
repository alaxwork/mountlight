package com.alaxat.mountlight.order.rest;


import com.alaxat.mountlight.order.dto.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class OrderController {

    private Logger logger = Logger.getLogger(OrderController.class.getName());

    @RequestMapping("/orders/customer/{customer}")
    List<Order> findByCustomer(@PathVariable("customer") Integer customerId) {
        logger.info("Geting orders by customer id" + customerId);
        return Collections.singletonList(new Order().setName("Android phone"));
    }
}
