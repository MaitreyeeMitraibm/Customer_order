package com.ibm.repository;

import java.util.List;

import com.ibm.model.Customer;

public interface CustomerRepository {
	Customer insertCustomerOrder(Customer customer) throws Exception;
	List<Customer> getAllCustomerOrders() throws Exception;
	Customer findByCustomerId(String cusId) throws Exception;
	Customer updateByCustomerId(Customer cus) throws Exception;
	Boolean deleteByCustomerId(Customer cus) throws Exception;
}