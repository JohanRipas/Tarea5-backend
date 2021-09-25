package com.disponibilidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.disponibilidad.entity.Usuario;
import com.disponibilidad.service.UsuarioService;

@RestController
@RequestMapping("/Solucion/Usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
	 
	@Autowired
	private UsuarioService usuarioservice;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Usuario>>listadoUsuarios(){
		List<Usuario>lista=usuarioservice.listaUsuario();
		return ResponseEntity.ok(lista);
	}

}
