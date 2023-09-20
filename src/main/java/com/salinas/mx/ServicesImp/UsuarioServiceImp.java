package com.salinas.mx.ServicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.salinas.mx.Repository.IUsuarioRepository;
import com.salinas.mx.Services.IUsuarioService;
import com.salinas.mx.entities.UsuarioEntity;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	IUsuarioRepository usuarioRepository;

	@Override
	public ResponseEntity<?> guardarUsuario(UsuarioEntity usuario) {
		UsuarioEntity user = usuarioRepository.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}

}
