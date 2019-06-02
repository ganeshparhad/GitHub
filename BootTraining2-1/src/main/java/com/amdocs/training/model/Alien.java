package com.amdocs.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Alien {
	@Id
	int aid;
	String aname;
	String tech;

}

