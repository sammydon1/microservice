package com.chidov.orderservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chidov.orderservice.api.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
