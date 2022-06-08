package com.example.demo.service;

import java.util.List; 

import com.example.demo.entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	
	Customer saveCustomer(Customer customer);

}
