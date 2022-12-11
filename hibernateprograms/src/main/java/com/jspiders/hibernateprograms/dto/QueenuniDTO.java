// OneToOne unidirectional

package com.jspiders.hibernateprograms.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class QueenuniDTO {
	
	@Id
	private int id;
	private String name;
}
