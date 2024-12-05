package com.senac.carlosalexandre.receptor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.carlosalexandre.receptor.dtos.UsuarioDTO;

public interface UsuarioRepository extends JpaRepository<UsuarioDTO, Integer> {
}
