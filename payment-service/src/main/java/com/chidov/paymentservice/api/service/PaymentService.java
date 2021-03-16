package com.chidov.paymentservice.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chidov.paymentservice.api.entity.Payment;
import com.chidov.paymentservice.api.repository.PaymentRepo;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepo paymentRepo;
	
	
	
	public Payment doPayment(Payment payment) {
		
		payment.setPaymentStatus(paymentStatus());
		
		payment.setTransactionId(UUID.randomUUID().toString());
		
		
		return paymentRepo.save(payment);
	}
	

	
	
	
	
	public String paymentStatus() {
		
       return new Random().nextBoolean()?"success":"false";
	}
}

