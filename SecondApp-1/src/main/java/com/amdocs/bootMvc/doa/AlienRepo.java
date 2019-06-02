package com.amdocs.bootMvc.doa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.amdocs.bootMvc.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
	
	List<Alien> findByTech(String tech); //findByTech is not given by spring JPA .when we want to write custom query we can write out own method
	//naming of method must follow the protocol like findBy<attribute-name>()
	
	List<Alien> findByAidGreaterThan(int id);
	//naming of method must follow the protocol like findBy<condition>()
	
	
	//we can use @Query to write complex queries, here nameing convention is not required 
	@Query("from Alien where tech=?1 order by aname")   //query is depend on kind of DB
	List<Alien> findByTechSorted(String tech);

}
