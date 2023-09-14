package com.salinas.mx.ServicesImp;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.salinas.mx.Repository.ITipoCombustibleCrudRepository;
import com.salinas.mx.Repository.ITipoCombustibleRepository;
import com.salinas.mx.Services.ITipoCombustibleService;
import com.salinas.mx.entities.TipoCombustible;
import com.salinas.mx.reponse.TipoCombResponse;

@Service
public class TipoCombustibleServiceImp implements ITipoCombustibleService {

	@Autowired
	ITipoCombustibleRepository tipoCombustibleRepository;

	@Autowired
	ITipoCombustibleCrudRepository tipoCombustibleCrudRepository;


	@Override
	public TipoCombustible crear(TipoCombustible tipoComb) {
      System.out.println("Objeto en la Imp:  " + tipoComb.toString());
      
		TipoCombustible resgitroGusrdadoOff = tipoCombustibleRepository.save(tipoComb);
      
      
		return resgitroGusrdadoOff;
	}


	@Override
	public ResponseEntity<TipoCombResponse> obtenerTodasTipCombPers() {

		TipoCombResponse response = new TipoCombResponse();
		List<TipoCombustible> listComb = tipoCombustibleRepository.findAll();
		response.setListaTipoComb(listComb);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	
	@Override
	@Transactional
	public TipoCombustible buscarPorId(int id_combustible) {

		// Un valor null puede almacenar el Optional
		Optional<TipoCombustible> unSoloRegistro = tipoCombustibleRepository.findById(id_combustible);

		if (unSoloRegistro.isPresent()) {
			return unSoloRegistro.get();
		} else {
			return null;
		}

	}

	@Override
	@Transactional
	public List<TipoCombustible> listaDeTiposCombustible() {
		List<TipoCombustible> listaCompletaDeDB = tipoCombustibleRepository.findAll();
	
		return listaCompletaDeDB;
	}

	@Override
	public void actualizarComb() {

		System.out.println("impresion por consola....");
	}

	@Override
	public void borrarTipoComb(Integer idTipoComb) {

		tipoCombustibleCrudRepository.deleteById(idTipoComb);

	}




}
