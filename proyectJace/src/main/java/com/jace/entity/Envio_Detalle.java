package com.jace.entity;

import javax.persistence.Table;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="detalles_envio")
@Table(name="detalles_envio")
public class Envio_Detalle {
 
	@OneToOne
	private Envio envio;
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "cod_envio")
	private String cod_envio;
	
	@Column(name = "fecha_envio")
	private Date fecha_envio;
	
	@Column(name =" fecha_entrega")
	private Date fecha_entrega;
	
	@Column(name ="origen")
	private String origen;
	
	@Column(name = "destino")
	private String destino;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "num_bultos")
	private float numBultos;
	
	@Column(name ="peso")
	private float peso;
	
	@Column(name = "Destinatario")
	private String destinatario;

	
	public Envio_Detalle() {
		super();
	}
	public Envio_Detalle(Date fecha_envio, Date fecha_entrega, String origen, String destino, String estado, float bultos, float peso, String destinatario ) {
		
		super();
		this.fecha_envio= fecha_envio;
		this.fecha_entrega= fecha_entrega;
		this.origen= origen;
		this.destino = destino;
		this.estado = estado;
		this.numBultos= bultos;
		this.peso = peso;
		this.destinatario= destinatario;
		
	}
	
	
	
	public String getCod_envio() {
		return cod_envio;
	}
	public void setCod_envio(String cod_envio) {
		this.cod_envio = cod_envio;
	}
	public Envio getEnvio() {
		return envio;
	}
	public void setEnvio(Envio envio) {
		this.envio = envio;
	}
	public Date getFecha_envio() {
		return fecha_envio;
	}
	public void setFecha_envio(Date fecha_envio) {
		this.fecha_envio = fecha_envio;
	}
	public Date getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getNumBultos() {
		return numBultos;
	}
	public void setNumBultos(float numBultos) {
		this.numBultos = numBultos;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	@Override
	public String toString() {
		return "Envio_Detalle [envio=" + envio + ", cod_envio=" + cod_envio + ", fecha_envio=" + fecha_envio
				+ ", fecha_entrega=" + fecha_entrega + ", origen=" + origen + ", destino=" + destino + ", estado="
				+ estado + ", numBultos=" + numBultos + ", peso=" + peso + ", destinatario=" + destinatario + "]";
	}
	
	
	
	
}
	