package com.jspiders.hibernatestudent.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDTO {
	@Id
	private int id;
	private String name;
	private String email;
	
}
