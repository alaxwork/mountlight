package com.alaxat.mountlight.order.rest;

import com.alaxat.mountlight.order.dao.OrderRepository;
import com.alaxat.mountlight.order.dto.OrderDto;
import com.alaxat.mountlight.order.entity.Order;
import com.alaxat.mountlight.order.mapper.OrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrderRepository repository;

    @Autowired
    private OrderMapper mapper;

    @GetMapping("/customer/{customer}")
    List<OrderDto> getCustomerOrders(@PathVariable("customer") String customerId) {
        logger.info("Geting orders by customer id {}", customerId);
        logger.info("{} test", "+3");
        List<Order> orders = repository.findByCustomerId(customerId);
        return mapper.toOrderDtos(orders);
    }

//    @GetMapping("/people")
//    Mono<String> namesByLastname(/*@RequestParam Mono<String> lastname*/) {
//        return Mono.just("test");// result.map(it -> it.getFullName());
//    }
}
