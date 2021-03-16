package com.chidov.orderservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chidov.orderservice.api.common.TransactionRequest;
import com.chidov.orderservice.api.common.TransactionResponse;
import com.chidov.orderservice.api.entity.Order;
import com.chidov.orderservice.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	
	
	@PostMapping("/bookOrder")
	private TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest) {
		
		
		return orderService.saveOrder(transactionRequest);
		
	
		
	}
	

}
