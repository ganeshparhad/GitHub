package com.amdocs.bootMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.amdocs.bootMvc.doa.AlienRepo;
import com.amdocs.bootMvc.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAliean(Alien alien)
	{
		repo.save(alien);
		 return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView addAliean(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("show.jsp");
		Alien alien = repo.findById(id).orElse(new Alien());
		
		//System.out.println(repo.findByTech("java"));  //findByTech("java")  this is custom method need to declare in interface
		//System.out.println(repo.findByAidGreaterThan(101));  //findByAidGreaterThan(101) this is custom method we need to follow naming convention
		//System.out.println(repo.findByTechSorted("java"));
		mv.addObject(alien);
		 return mv;
	}
	
	@RequestMapping("/deleteAlien")
	public String deleteAliean(@RequestParam int id)
	{
		repo.deleteById(id);
		 return "home.jsp";
	}

}
