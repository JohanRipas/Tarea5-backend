package com.disponibilidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disponibilidad.entity.Usuario;
import com.disponibilidad.repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService {
	 @Autowired
	private UsuarioRepository rep;
	@Override
	public List<Usuario> listaUsuario() {
	
		return rep.findAll();
	}

}
