package com.disponibilidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disponibilidad.entity.disponibilidad;
import com.disponibilidad.repository.DisponibilidadRepository;
@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {
	 @Autowired

	private DisponibilidadRepository rep;
	@Override
	public disponibilidad insertarActualizaDisponibilidad(disponibilidad obj) {
	
		return rep.save(obj);	
		}

	@Override
	public List<disponibilidad> listaDisponibilidad() {
		
		return rep.findAll();
		}

}
