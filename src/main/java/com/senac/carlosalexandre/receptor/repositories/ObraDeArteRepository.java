package com.senac.carlosalexandre.receptor.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.carlosalexandre.receptor.entities.ObraDeArte;

public interface ObraDeArteRepository extends JpaRepository<ObraDeArte, Integer> {
	List<ObraDeArte> findByStatus(int status);

}