package com.jace.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="ubicaccion")
@Table(name="ubicacion")

public class Ubicacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	 
//	@ManyToMany
//	private Terminal terminal;
//	private Vehiculo vehiculo;
//	 

	
	@Column(name="fecha_hora_entrada")
	private Date fecha_hora_entrada;
	
	@Column(name = "fecha_hora_salida")
	private Date fecha_hora_salida;

	public Date getFecha_hora_entrada() {
		return fecha_hora_entrada;
	}

	public void setFecha_hora_entrada(Date fecha_hora_entrada) {
		this.fecha_hora_entrada = fecha_hora_entrada;
	}

	public Date getFecha_hora_salida() {
		return fecha_hora_salida;
	}

	public void setFecha_hora_salida(Date fecha_hora_salida) {
		this.fecha_hora_salida = fecha_hora_salida;
	}

	@Override
	public String toString() {
		return "Ubicacion [fecha_hora_entrada=" + fecha_hora_entrada + ", fecha_hora_salida=" + fecha_hora_salida + "]";
	}

	
	
}
