package com.amdocs.bootMvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.amdocs.bootMvc.doa.AlienRepo;
import com.amdocs.bootMvc.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping("/aliens")  //@RequestMapping(path="/aliens",produces={"application/xml"})
	public  List<Alien> getAliean()
	{
		
		 return repo.findAll();
	}
	
	@RequestMapping("/aliens/{aid}")
	public Optional<Alien> getAliean(@PathVariable int aid)
	{
		
		 return repo.findById(aid);
	}
	
	@DeleteMapping("/aliens/{aid}")
	public String deleteAlien(@PathVariable int aid)
	{
		Alien a=repo.getOne(aid);
		repo.deleteById(aid);
		return "deleted";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST) //not working
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		 return alien;
	}

}
