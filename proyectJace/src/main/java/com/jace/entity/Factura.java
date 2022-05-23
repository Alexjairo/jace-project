package com.jace.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import oracle.sql.DATE;

@Entity(name="factura")
@Table (name = "factura")
public class Factura {
	
	
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
//	@OneToMany
//	private Envio envio;
	
	@Column(name="num_factura")
	private String num_factura;
	
   @Column(name="fecha_emision")
	private Date fecha_Emision;
	
	@Column(name="metodo_pago")
	private String metodo_pago;
	
	@Column(name="precio")
	private float precio;
	
	private Factura() {
		super();
	}
	
	private Factura(Date fecha, String metodo, float precio) {
		super();
		this.metodo_pago= metodo;
		this.fecha_Emision = fecha;
		this.precio = precio;
	}

	public String getNum_factura() {
		return num_factura;
	}

	public void setNum_factura(String num_factura) {
		this.num_factura = num_factura;
	}

	public Date getFecha_Emision() {
		return fecha_Emision;
	}

	public void setFecha_Emision(Date fecha_Emision) {
		this.fecha_Emision = fecha_Emision;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * El método toString() devuelve la representación de cadena del objeto
	 * 
	 * @return Se devuelve el método toString().
	 */
	@Override
	public String toString() {
		return "Factura [num_factura=" + num_factura + ", fecha_Emision=" + fecha_Emision + ", metodo_pago="
				+ metodo_pago + ", precio=" + precio + "]";
	}


	
	
	

}
