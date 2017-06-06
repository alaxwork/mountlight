package com.alaxat.mountlight;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("ml-order")
public interface OrderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/orders/customer/{customer}")
    List<Order> findByCustomer(@PathVariable("customer") Integer customerId);
}
