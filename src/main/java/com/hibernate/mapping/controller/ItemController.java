package com.hibernate.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.mapping.entity.Item;
import com.hibernate.mapping.service.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController 
{
	@Autowired
	private ItemService itemService;
	
	@PostMapping
	public void createQuestion(@RequestBody Item item)
	{
		itemService.save(item);
	}
	
	@GetMapping
	public List<Item> getAllUser()
	{
		return itemService.getAll();
	}

}
