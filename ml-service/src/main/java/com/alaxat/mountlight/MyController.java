package com.alaxat.mountlight;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MyController {

    protected Logger logger = Logger.getLogger(MyController.class.getName());

    @RequestMapping("/customer")
    Customer getInfo() {
        logger.info("GET INFO");
        return new Customer().setName("test user");
    }
}
