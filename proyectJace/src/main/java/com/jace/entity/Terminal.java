package com.jace.entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "terminal")
@Table(name = "terminal")
public class Terminal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id_terminal")
	private String id_terminal;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="cod_postal")
	private String cpd_postal;

	public String getId_terminal() {
		return id_terminal;
	}

	public void setId_terminal(String id_terminal) {
		this.id_terminal = id_terminal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCpd_postal() {
		return cpd_postal;
	}

	public void setCpd_postal(String cpd_postal) {
		this.cpd_postal = cpd_postal;
	}

	@Override
	public String toString() {
		return "terminal [id_terminal=" + id_terminal + ", direccion=" + direccion + ", cpd_postal=" + cpd_postal + "]";
	}
	
	
	
}
