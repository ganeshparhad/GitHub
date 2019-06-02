package com.amdocs.training.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.training.model.Alien;

@Repository
public interface AlienDao extends JpaRepository<Alien, Integer> {

	Alien findByaname(String aname);  //custome method created by us

}
