package com.programmingtechie.oederservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.programmingtechie.oederservice.dto.OrdeLineItemsDto;
import com.programmingtechie.oederservice.dto.OrderRequest;
import com.programmingtechie.oederservice.model.Order;
import com.programmingtechie.oederservice.model.OrderLineItems;
import com.programmingtechie.oederservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

	private final OrderRepository orderRepository;
	public void placeOrder(OrderRequest orderRequest) {
		 Order order = new Order();
		 order.setOrderNumber(UUID.randomUUID().toString());
		 
		 List<OrderLineItems> orderLineItems =  orderRequest.getOrdeLineItemsDtos()
		 													.stream()
		 													.map(this::mapToDto)
		 													.toList();
		 order.setOrderLineItems(orderLineItems);
		 orderRepository.save(order);
	}

	private OrderLineItems mapToDto(OrdeLineItemsDto orderLineItemsDto) {

		OrderLineItems orderLineItems = new OrderLineItems();
		orderLineItems.setPrice(orderLineItemsDto.getPrice());
		orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
		orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
		
		return orderLineItems;
	}
}
