package com.hibernate.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.mapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	

}
