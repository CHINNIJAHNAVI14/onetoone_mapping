package com.hibernate.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.mapping.entity.Item;
import com.hibernate.mapping.repository.ItemRepository;

@Service
public class ItemService
{
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAll()
	{
		List<Item> item = new ArrayList<>();
		itemRepository.findAll().forEach(item::add);
		return item;
	}	 
	
	public void save(Item item)
	{
		itemRepository.save(item);
	}
 

}
