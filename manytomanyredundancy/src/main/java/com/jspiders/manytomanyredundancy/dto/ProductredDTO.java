package com.jspiders.manytomanyredundancy.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class ProductredDTO {
	
	@Id
	private int id;
	private String name;
	private double price;
	
	@ManyToMany (mappedBy = "products")
	private List<CustomerredDTO> customers;
}
