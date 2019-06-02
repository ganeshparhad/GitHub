package com.amdocs.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.training.model.Alien;
import com.amdocs.training.service.AlienService;

@RestController
public class AlienController {
	
	@Autowired
	AlienService alienService;
	
	@RequestMapping("/aliens")
	public List<Alien> getAllAlien()
	{
		System.out.println("inside getAlien");
		return alienService.getAlien();
	}
	
	@RequestMapping("/alien/{id}")
	public Optional<Alien> getAlien(@PathVariable int id)
	{
		return alienService.getAlienById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAlien(@PathVariable int id)
	{
		return alienService.deleteAlien(id);
	}
	
	@PostMapping("/add")
	public String addAlien(@RequestBody Alien alien)
	{
		return alienService.saveAlien(alien);
	}
	
	@PutMapping("/update")
	public String updateAlien(@RequestBody Alien alien)
	{
		return alienService.updateAlien(alien);
	}
	
	@RequestMapping("/search/{aname}")
	public Alien searchByName(@PathVariable String aname)
	{
		return alienService.SearchByName(aname);
		
	}
	
	
	
	

}
