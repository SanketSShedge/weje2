package com.jspiders.hibernateprograms.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class PlayerDTO {
	
	@Id
	private int id;
	private String name;
	
	@ManyToMany	(mappedBy = "player")
	private List<TeamDTO> team;
}
