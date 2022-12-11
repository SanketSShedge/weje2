// OneToMany unidirectional

package com.jspiders.hibernateprograms.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudDTO {
	
	@Id
	private int id;
	private String name;
}
