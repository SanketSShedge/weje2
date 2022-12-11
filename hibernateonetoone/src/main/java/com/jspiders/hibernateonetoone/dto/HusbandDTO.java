package com.jspiders.hibernateonetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class HusbandDTO {

	@Id
	private int id;
	private String name;
	private String email;
	
	@OneToOne
	private WifeDTO wife;
}
