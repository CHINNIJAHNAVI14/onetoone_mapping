package com.hibernate.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.mapping.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>
{

}
