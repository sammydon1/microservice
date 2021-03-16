package com.chidov.orderservice.api.common;

import java.io.Serializable;

import com.chidov.orderservice.api.entity.Order;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class TransactionRequest implements Serializable {
	
	@JsonProperty
	private Order order;
	
	@JsonProperty
	private Payment payment;
	
	
	
	
	public TransactionRequest() {
		
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	

}
