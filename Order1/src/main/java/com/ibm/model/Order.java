package com.ibm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@Column(name="order_id")
	private String orderId;
	
	@Column(name="order_type")
	private String orderType;
	
	@Column(name="order_price")
	private double orderPrice;
	
	@Column(name="is_confirmed")
	private Boolean isConfirmed;

	public Order(String orderId, double orderPrice, Boolean isConfirmed) {
		super();
		this.orderId = orderId;
		this.orderPrice = orderPrice;
		this.isConfirmed = isConfirmed;
	}
	
	
}