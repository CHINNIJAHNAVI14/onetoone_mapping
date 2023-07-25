package com.hibernate.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.mapping.entity.Customer;
import com.hibernate.mapping.service.CustomerService;
@RestController
@RequestMapping("/api/customer")
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public void createQuestion(@RequestBody Customer customer)
	{
		customerService.save(customer);
	}
	
	@GetMapping
	public List<Customer> getAllUser()
	{
		return customerService.getAll();
	}
	

}
