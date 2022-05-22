package com.jace.entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity(name= "seguros")
@Table(name="seguros")
public class Seguro {
	
	  @Id
	  @GeneratedValue(strategy= GenerationType.IDENTITY)
	  @Column(name="cod_seguro")
	  private String cod_seguro;
	  
	  @Column(name="tipo_seguro")
	  private String tipo_seguro;
	  
	  @Column(name="descripcion")
	  private String descripcion;
	  
	  public Seguro() {}
	  public Seguro(String cod_seguros, String tipo_seguro, String descripcion) {
		  this.cod_seguro= cod_seguros;
		  this.tipo_seguro= tipo_seguro;
		  this.descripcion= descripcion;
	  }
	public String getCod_seguros() {
		return cod_seguro;
	}
	public void setCod_seguros(String cod_seguros) {
		this.cod_seguro = cod_seguros;
	}
	public String getTipo_seguro() {
		return tipo_seguro;
	}
	public void setTipo_seguro(String tipo_seguro) {
		this.tipo_seguro = tipo_seguro;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Seguros [cod_seguros=" + cod_seguro + ", tipo_seguro=" + tipo_seguro + ", descripcion=" + descripcion
				+ "]";
	}
	 
	

}
