package com.alaxat.mountlight.order;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class OrderController {

    protected Logger logger = Logger.getLogger(OrderController.class.getName());

    @RequestMapping("/order")
    Order getInfo() {
        logger.info("GET INFO");
        return new Order().setName("test user");
    }
}
