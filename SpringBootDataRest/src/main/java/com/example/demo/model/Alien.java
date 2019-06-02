package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Alien {
	@Id
	@GeneratedValue
	private int aid;
	private String aname;
	private String tech;

}
