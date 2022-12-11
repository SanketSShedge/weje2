// OneToOne unidirectional

package com.jspiders.hibernateprograms.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class KinguniDTO {
	@Id
	private int id;
	private String name;
	
	@OneToOne
	private QueenuniDTO queen;
}
