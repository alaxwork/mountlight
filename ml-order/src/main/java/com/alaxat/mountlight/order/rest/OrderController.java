package com.alaxat.mountlight.order.rest;


import com.alaxat.mountlight.order.dto.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/orders/customer/{customer}")
    List<Order> findByCustomer(@PathVariable("customer") Integer customerId) {
        logger.info("Geting orders by customer id {}", customerId);
        logger.info("{} test", "+3");
        return Collections.singletonList(new Order().setName("Android phone"));
    }
}
