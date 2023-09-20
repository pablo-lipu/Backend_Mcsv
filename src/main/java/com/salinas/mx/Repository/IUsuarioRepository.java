package com.salinas.mx.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salinas.mx.entities.UsuarioEntity;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Integer>{

}
