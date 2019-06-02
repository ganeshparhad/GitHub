package com.amdocs.bootMvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Alien {
	@Id
	 private int aid;
	 private String aname;
	 private String tech;

}
