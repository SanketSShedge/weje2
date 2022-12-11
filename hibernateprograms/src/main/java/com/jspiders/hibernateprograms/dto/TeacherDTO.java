// OneToMany unidirectional

package com.jspiders.hibernateprograms.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TeacherDTO {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<StudDTO> students;
}
