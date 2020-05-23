package com.uca.capas.ejpractico.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public",name = "contribuyente")
public class Contribuyente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="c_contribuyente")
	private Integer id_contribuyente;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="s_nombre")
	private String nombre;
	
	@Size(message= "el campo no debe contener mas de 30 caracteres",max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="s_apellido")
	private String apellido;
	@Pattern(regexp="[\\d]{14}",message = "El campo debe tener 14 digitos")
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="s_nit")
	private String nit;
	
	//@NotNull(message = "el campo no puede estar vacio")
	@Column(name="f_fecha_ingreso")
	private Calendar fecha_ingreso;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_importancia")
	private Importancia importancia;
	
	
	public Contribuyente() {
		// TODO Auto-generated constructor stub
	}
	

	public Integer getId_contribuyente() {
		return id_contribuyente;
	}

	public void setId_contribuyente(Integer id_contribuyente) {
		this.id_contribuyente = id_contribuyente;
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

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Calendar getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Calendar fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}
	
	public String getFechaDelegate() {
		if(this.fecha_ingreso==null) {
			return "";
		}
		else {
			Date date = fecha_ingreso.getTime();  
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(date);
			
		
			//return "SDADF";
		}
	}
	
	
	
	
}
