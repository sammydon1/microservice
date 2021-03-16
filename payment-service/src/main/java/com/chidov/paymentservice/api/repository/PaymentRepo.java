package com.chidov.paymentservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chidov.paymentservice.api.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
