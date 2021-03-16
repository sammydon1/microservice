package com.chidov.orderservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="ORDER_TB")
public class Order{
	
	@Id
	private int id;
	
   
	private String name;
    
    
	private String qty;
    
    
	private double price;
	
	
	
	
	
	
	public Order() {
	
	}






	public Order(int id, String name, String qty, double price) {
		
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getQty() {
		return qty;
	}






	public void setQty(String qty) {
		this.qty = qty;
	}






	public double getPrice() {
		return price;
	}






	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
