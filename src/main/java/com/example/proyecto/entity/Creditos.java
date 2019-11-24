package com.example.proyecto.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "creditos")
public class Creditos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private Integer nit;
	
	private Integer salario;
	
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "tiempo_inicio")
	private Date tiempoInicio;

	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="usuarios_id")
	private Usuarios usuario;

	
	public Creditos() {
		super();
	}


	public Creditos(Long id, Integer nit, Integer salario, String nombre, Usuarios usuario) {
		super();
		this.id = id;
		this.nit = nit;
		this.salario = salario;
		this.nombre = nombre;
		this.usuario = usuario;
	}


	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Integer getNit() {
		return nit;
	}




	public void setNit(Integer nit) {
		this.nit = nit;
	}



	public Integer getSalario() {
		return salario;
	}




	public void setSalario(Integer salario) {
		this.salario = salario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Usuarios getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "Creditos [id=" + id + ", nit=" + nit + ", salario=" + salario + ", nombre=" + nombre + ", usuario="
				+ usuario + "]";
	}


	
	
}
