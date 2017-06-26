package com.alaxat.mountlight.order.dto;

public class OrderDto {

    private Long id;
    private String customerId;
    private String description;

    public Long getId() {
        return id;
    }

    public OrderDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public OrderDto setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderDto setDescription(String description) {
        this.description = description;
        return this;
    }
}
