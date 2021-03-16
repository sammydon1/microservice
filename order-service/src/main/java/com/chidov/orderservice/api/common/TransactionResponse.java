package com.chidov.orderservice.api.common;

import java.io.Serializable;

import com.chidov.orderservice.api.entity.Order;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class TransactionResponse  implements Serializable{
	
	@JsonProperty
	private Order order;
	
	
	@JsonProperty
	private double amount;
	
	@JsonProperty
	private String transactionId;
	
	@JsonProperty
	private String message;
	
	

	public TransactionResponse() {
	
	}

	
	

	public TransactionResponse(Order order, double amount, String transactionId, String message) {
		
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
