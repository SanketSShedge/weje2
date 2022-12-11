//ManyToOne unidirectional

package com.jspiders.hibernateprograms.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class MemberDTO {
	
	@Id
	private int id;
	private String name;
	
	@ManyToOne
	private GroupDTO group;

}
