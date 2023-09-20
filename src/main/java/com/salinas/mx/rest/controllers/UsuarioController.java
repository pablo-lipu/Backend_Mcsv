package com.salinas.mx.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salinas.mx.Services.IUsuarioService;
import com.salinas.mx.entities.UsuarioEntity;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RestController // ESta anotacion se usa principalmente para crear servicios RETs FULL,
@RequestMapping("/usuarios") // asi creamos una ruta de primer nivel
public class UsuarioController {

	@Autowired
	IUsuarioService usuarioService;

	@PostMapping("/crear-usuario")
	public ResponseEntity<?> crearUsuario(@RequestBody UsuarioEntity usuario) {

		System.out.println("Objeto resibido desde el cliente: " + usuario);
		ResponseEntity<?> response = usuarioService.guardarUsuario(usuario);
		return response;
	}

}
