package com.alaxat.mountlight;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MyController {

    protected Logger logger = Logger.getLogger(MyController.class.getName());


    @Autowired
    private OrderClient orderClient;


    @RequestMapping("/customer")
    Customer getInfo() {
        logger.info("GET INFO");
        Order info = orderClient.getInfo();
        return new Customer().setName(info.name);
    }
}
