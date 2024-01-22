package com.ibm.service;

import java.util.List;
import java.util.UUID;

import com.ibm.model.Customer;
import com.ibm.repository.CustomerRepository;
import com.ibm.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService{
	private CustomerRepository cusOrRepo;
	{
		try {
			cusOrRepo = new CustomerRepositoryImpl();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public Customer insertCustomerOrder(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customer.setCustomerId(UUID.randomUUID().toString().split("-")[0]);
		customer.getOrder().setOrderId(UUID.randomUUID().toString().split("-")[0]);
		return cusOrRepo.insertCustomerOrder(customer);
	}
	@Override
	public List<Customer> getAllCustomerOrders() throws Exception {
		// TODO Auto-generated method stub
		return cusOrRepo.getAllCustomerOrders();
	}
	@Override
	public Customer findByCustomerId(String cusId) throws Exception {
		// TODO Auto-generated method stub
		return cusOrRepo.findByCustomerId(cusId);
	}
	@Override
	public Customer updateByCustomerId(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		return cusOrRepo.updateByCustomerId(cus);
	}
	@Override
	public Boolean deleteByCustomerId(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		return cusOrRepo.deleteByCustomerId(cus);
	}
}