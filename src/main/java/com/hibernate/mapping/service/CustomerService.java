package com.hibernate.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.mapping.entity.Customer;
import com.hibernate.mapping.repository.CustomerRepository;
@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAll()
	{
		List<Customer> customer = new ArrayList<>();
		customerRepository.findAll().forEach(customer::add);
		return customer;
	}	 
	
	public void save(Customer customer)
	{
		customerRepository.save(customer);
	}
 
}
