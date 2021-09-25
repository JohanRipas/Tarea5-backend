package com.disponibilidad.service;

import java.util.List;

import com.disponibilidad.entity.disponibilidad;

public interface DisponibilidadService {
	public disponibilidad insertarActualizaDisponibilidad(disponibilidad obj);
	public List<disponibilidad>listaDisponibilidad();
}
