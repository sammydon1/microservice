package com.chidov.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chidov.orderservice.api.common.Payment;
import com.chidov.orderservice.api.common.TransactionRequest;
import com.chidov.orderservice.api.common.TransactionResponse;
import com.chidov.orderservice.api.entity.Order;
import com.chidov.orderservice.api.repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public TransactionResponse saveOrder(TransactionRequest transactionRequest) {
		
		String message="";
		
		
		Order order=transactionRequest.getOrder();
		
		
		Payment payment=transactionRequest.getPayment();
		
		
		payment.setAmount(order.getPrice());
		
		
		payment.setOrder_id(order.getId());
		
		//rest API call to payment service
		
		Payment paymentResponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		
		
	    message= paymentResponse.getPaymentStatus().equals("success")?"payment processing successful and order plaed":"payment processing failed, order added  to cart";
		
	    
		orderRepo.save(order);
		
		
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),message);
		
	}

}
