package com.alaxat.mountlight;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneFilter {

    List<Order> filter(List<Order> orders) {
        return orders.stream().filter(o -> o.getName().contains("Android")).collect(Collectors.toList());
    }
}
