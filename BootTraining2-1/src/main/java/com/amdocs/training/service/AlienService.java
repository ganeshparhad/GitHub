package com.amdocs.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.training.model.Alien;
@Service
public class AlienService {
	@Autowired
	AlienDao alienDao;
 
	public List<Alien> getAlien()
	{
		return alienDao.findAll();
	}

	public Optional<Alien> getAlienById(int id) {
		return alienDao.findById(id);
	}

	public String deleteAlien(int id) {
		alienDao.deleteById(id);
		return "Record Deleted";
	}

	public String saveAlien(Alien alien) {
		alienDao.save(alien);
		return "Record Inserted";
	}

	public String updateAlien(Alien alien) {
		alienDao.save(alien);
		return "Recored Updated";
	}

	public Alien SearchByName(String aname) {
		return alienDao.findByaname(aname);
	}
	


}
