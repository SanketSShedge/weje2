// OneToOne Bidirectional.

package com.jspiders.hibernateprograms.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class QueenDTO {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne
	private KingDTO king;
}
