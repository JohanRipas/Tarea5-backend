package com.disponibilidad.entity;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    private String nombres;
    private String apaterno;
    private String amaterno;
    private Date fechaNacimiento;
    private Date fechaRegistro;
    private String email;
    private String estado;
    private String celular;
    private String direccion;
    private String login;
    private String password;
    private String dni;
    private int idTipoUsuario;
    private int idUbigeo;
}
