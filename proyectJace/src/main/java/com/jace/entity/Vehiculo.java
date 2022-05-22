package com.jace.entity;

import javax.persistence.Table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity(name = "vehiculo")
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "matricula")
	private String matricula;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "estado")
	private String estado;

	@Column(name = "capacidad")
	private float capacidad;

	@Column(name = "anyo")
	private Date anyo;

	public Vehiculo() {
	}

	public Vehiculo(String matricula, String modelo, String estado, float capacidad, Date anyo) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.estado = estado;
		this.capacidad = capacidad;
		this.anyo = anyo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

	public Date getAnyo() {
		return anyo;
	}

	public void setAnyo(Date anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", estado=" + estado + ", capacidad="
				+ capacidad + ", anyo=" + anyo + "]";
	}

}
