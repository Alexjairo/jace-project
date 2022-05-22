package com.jace.entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity(name="cargo")
@Table(name="cargo")
public class Cargo {
	  @Id
	  @GeneratedValue(strategy= GenerationType.IDENTITY)
	  
	  @Column(name="cod_cargo")
	  private String cod_cargo;
	  
	  @Column(name="tipo")
	  private String tipo;
	  
	  public Cargo() {}
	  public Cargo(String cod_cargo , String tipo ) {
		  this.cod_cargo= cod_cargo;
		  this.tipo = tipo;  
	  }
	public String getCod_cargo() {
		return cod_cargo;
	}
	public void setCod_cargo(String cod_cargo) {
		this.cod_cargo = cod_cargo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "cargo [cod_cargo=" + cod_cargo + ", tipo=" + tipo + "]";
	}

}
