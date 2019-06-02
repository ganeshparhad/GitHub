package com.amdocs.bootMvc.doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.amdocs.bootMvc.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
