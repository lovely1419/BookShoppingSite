package com.Tree.dao;

import java.util.List;

import com.Tree.model.Customer;

public interface CustomerBook {
	
	public boolean addCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
	public List <Customer> getAllCustomer();
	public Customer getCustomerById(String customerId);
	public Customer getCustomerByCustomerEmail(String email);
	public boolean validate(String customerEmail,String CustomerPassword);

}
