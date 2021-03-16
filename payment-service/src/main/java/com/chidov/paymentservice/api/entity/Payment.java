package com.chidov.paymentservice.api.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@SuppressWarnings("serial")
@Entity
@Table(name = "PAYMENT_TB")
public class Payment implements Serializable {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private int paymentId;
	
	@JsonProperty
	private String paymentStatus;
	
	
	@JsonProperty
	private String transactionId;
	
	
	@JsonProperty
	private int order_id;
	
	@JsonProperty
	private double amount;
	
	
	
	public Payment() {
	
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	
	
	
	

}
