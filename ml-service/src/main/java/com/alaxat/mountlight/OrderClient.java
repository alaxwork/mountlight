package com.alaxat.mountlight;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ml-order")
public interface OrderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/order")
    Order getInfo();
}
