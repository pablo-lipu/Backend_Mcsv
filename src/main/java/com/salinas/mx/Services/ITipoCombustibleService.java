package com.salinas.mx.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.salinas.mx.entities.TipoCombustible;
import com.salinas.mx.reponse.TipoCombResponse;

public interface ITipoCombustibleService {

	//Crear un nuevo regisdtro o recurso
	public TipoCombustible crear(TipoCombustible tipoComb);
	
	//Mi metodo abstracto retornarme u objeto de tipo TipoCombustible. 
	public  TipoCombustible buscarPorId(int id_comb);
	
	public List<TipoCombustible> listaDeTiposCombustible();
	
	public void actualizarComb();
	
	public void borrarTipoComb(Integer idTipoComb);
	
	public ResponseEntity<TipoCombResponse> obtenerTodasTipCombPers();
}
