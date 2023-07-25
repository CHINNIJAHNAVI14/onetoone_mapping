package com.hibernate.mapping.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="itm")
public class Item
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	
	public Item() {}
	
	public Item(int id, String itemName) {
		super();
		this.id = id;
		this.itemName = itemName;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	

}
