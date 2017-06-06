package com.alaxat.mountlight;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class MyController {

    protected Logger logger = Logger.getLogger(MyController.class.getName());

    @Autowired
    private OrderClient orderClient;

    @RequestMapping("/customer")
    Customer getInfo() {
        logger.info("GET INFO");
        List<Order> orderList = orderClient.findByCustomer(34);
        return new Customer().setName(orderList.get(0).name);
    }
}
