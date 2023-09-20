package com.salinas.mx.Services;

import org.springframework.http.ResponseEntity;

import com.salinas.mx.entities.UsuarioEntity;

public interface IUsuarioService {

	public ResponseEntity<?> guardarUsuario(UsuarioEntity usuario);
}
