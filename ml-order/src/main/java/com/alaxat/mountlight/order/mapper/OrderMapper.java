package com.alaxat.mountlight.order.mapper;

import com.alaxat.mountlight.order.dto.OrderDto;
import com.alaxat.mountlight.order.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

	Order toOrder(OrderDto dto);

	OrderDto toOrderDto(Order order);

	List<OrderDto> toOrderDtos(List<Order> orders);
}
