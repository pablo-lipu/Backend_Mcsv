package com.salinas.mx.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salinas.mx.Repository.ITipoCombustibleRepository;
import com.salinas.mx.Services.ITipoCombustibleService;
import com.salinas.mx.entities.TipoCombustible;
import com.salinas.mx.reponse.ResponseRestTipoComb;
import com.salinas.mx.reponse.TipoCombResponse;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
@RestController // ESta anotacion se usa principalmente para crear servicios RETs FULL,
@RequestMapping("/combustibles") // asi creamos una ruta de primer nivel
public class CombustibleController {

	@Autowired
	ITipoCombustibleService tipoCombustibleService;

	@GetMapping("/todos") /* /combustibles/nombre-combsutibles */
	public List<TipoCombustible> getAllCombustibles() {

		List<TipoCombustible> listaCompletaDTipoDeComb = tipoCombustibleService.listaDeTiposCombustible();
		return listaCompletaDTipoDeComb;
	}

	@GetMapping("/un-tipo-combustible/{id_combustible}") // localhost:8080/combustibles/un-tipo-combustible
	public ResponseEntity<?> getIdCombustible(@PathVariable int id_combustible) {

		TipoCombustible response = tipoCombustibleService.buscarPorId(id_combustible);

		if (response != null) {
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} else {
			return ResponseEntity.ok("No existe el registro con ese ID.");
		}
	}

	@Autowired
	ITipoCombustibleRepository tipoCombustibleRepository;

	

	@GetMapping("/personalizada")
	public ResponseEntity<TipoCombResponse> otraRespuestaPerso(){
		ResponseEntity<TipoCombResponse> response= tipoCombustibleService.obtenerTodasTipCombPers();
		return response;
	}
	
	
	//Respuesta mas compleja pero mas completa
	@GetMapping("/all-custom")
	public ResponseEntity<ResponseRestTipoComb> obtenerTodosTipComb() {
		ResponseRestTipoComb responseCustom = new ResponseRestTipoComb();
		List<TipoCombustible> listComb = tipoCombustibleRepository.findAll();
		responseCustom.setMetadata("ok", "200", "todo ok sin falla.");
		responseCustom.getTipoCombResponse().setListaTipoComb(listComb);
		return ResponseEntity.status(HttpStatus.OK).body(responseCustom);
	}
	
	@PutMapping("/actualizar/{idComb}")
	public void actualizar(@PathVariable int idComb, @RequestBody TipoCombustible tipoComb) {
		
		
	}
}
