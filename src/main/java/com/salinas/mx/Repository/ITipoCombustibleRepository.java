package com.salinas.mx.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.salinas.mx.entities.TipoCombustible;

 public interface ITipoCombustibleRepository extends JpaRepository<TipoCombustible, Integer>{

}