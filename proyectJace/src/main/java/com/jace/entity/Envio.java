package com.jace.entity;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="envio_paquete")
@Table(name="envio_paquete")
public class Envio {

	@ManyToOne
	@JoinColumn(name= "id_terminal")
	private Terminal  terminal;
	
	@OneToOne
	@JoinColumn(name= "cod_seguro")
	private Seguro seguro;
	
	
	@ManyToOne
	@JoinColumn(name = "dni_cliente")
	private User user;
	
	
	@OneToOne
	@JoinColumn(name = "dni_empleado")
	private  Empleado empleado;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "cod_envio")
	private String cod_envio;
	
	@Column(name= "tipo_envio")
	private String tipo_envio;
	
	
	
	public Envio() {
		super();
	}
	public Envio(String cod_envio, String tipo_envio, String dni_empleado, 
			String id_terminal, String cod_seguros, String dni_seguro , String dni_cliente) {
		this.cod_envio= cod_envio;
		this.tipo_envio= tipo_envio;

	}
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	public Seguro getSeguro() {
		return seguro;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public String getCod_envio() {
		return cod_envio;
	}
	public void setCod_envio(String cod_envio) {
		this.cod_envio = cod_envio;
	}
	public String getTipo_envio() {
		return tipo_envio;
	}
	public void setTipo_envio(String tipo_envio) {
		this.tipo_envio = tipo_envio;
	}
	@Override
	public String toString() {
		return "Envio [terminal=" + terminal + ", seguro=" + seguro + ", user=" + user + ", empleado=" + empleado
				+ ", cod_envio=" + cod_envio + ", tipo_envio=" + tipo_envio + "]";
	}
	

	
	
}
