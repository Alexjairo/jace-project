package com.jace.entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name="empleado")
@Table(name="empleado")
public class Empleado {
	

	
	@ManyToOne
	@JoinColumn(name = "cargo")
	private Cargo cargo;
	
	@ManyToOne
	@JoinColumn(name = "terminal")
	private Terminal terminals;
	
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)	
	@Column(name="dni")
	  private String dni;
	  
	  @Column(name="nombre")
	  private String nombre;
	
	  @Column(name="apellidos")
	  private String apellido;
	
	  
	  @Column(name="direccion")
	  private String direccion;
	
	  @Column(name="cod_postal")
	  private String cod_postal;
	
	  @Column(name="password")
	  private String password;
	   
	  @Column(name="telefono")
	  private String telefono;
	  
	  @Column(name = "Encargado")
	  private String encargado;
	  
	
	  @Column(name = "email")
	  private String email;
	  
      public Empleado() {
    	super();  
      }
      public Empleado(String dni, String nombre, String apellido, String direccion, String cod_postal, String password, String telefono, String encargado, String email) {
    	 
    	 super();
    	 this.dni= dni;
    	 this.nombre = nombre;
    	 this.apellido= apellido;
    	 this.direccion = direccion;
    	 this.cod_postal = cod_postal;
    	 this.password = password;
    	 this.telefono = telefono;
    	 this.encargado= encargado;
    	 this.email = email;
      }
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Terminal getTerminals() {
		return terminals;
	}
	public void setTerminals(Terminal terminals) {
		this.terminals = terminals;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Empleado [cargo=" + cargo + ", terminals=" + terminals + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", direccion=" + direccion + ", cod_postal=" + cod_postal + ", password="
				+ password + ", telefono=" + telefono + ", encargado=" + encargado + ", email=" + email + "]";
	}
	

}
