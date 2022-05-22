package com.jace.entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name = "cliente")
@Table(name = "cliente")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dni")
	private String dni;

	@Column(name = "password")
	private String password;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "direccion")
	private String direccion;
//  
	@Column(name = "cod_postal")
	private String cod_postal;
//  
	@Column(name = "telefono")
	private String telefono;
//  

	public User() {
	}

	public User(String dni, String password, String nombre, String apellido, String direccion, String cod_postal,
			String telefono) {
		this.dni = dni;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.direccion = direccion;
		this.cod_postal = cod_postal;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "User [dni=" + dni + ", password=" + password + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", cod_postal=" + cod_postal + ", telefono=" + telefono + "]";
	}

}
