//ManyToOne unidirectional

package com.jspiders.hibernateprograms.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class GroupDTO {
	
	@Id
	private int id;
	private String name;
}
