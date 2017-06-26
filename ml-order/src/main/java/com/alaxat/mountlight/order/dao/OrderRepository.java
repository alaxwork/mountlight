package com.alaxat.mountlight.order.dao;

import com.alaxat.mountlight.order.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByCustomerId(String customerId);
}