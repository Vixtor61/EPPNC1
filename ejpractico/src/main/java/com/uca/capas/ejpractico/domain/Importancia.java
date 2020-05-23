package com.uca.capas.ejpractico.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(schema = "public",name = "importancia")
public class Importancia {
	@Id
	@Column(name="c_importancia")
	private Integer id_importancia;
	
	@Column(name = "s_importancia")
	private String importancia;
	
	
	@OneToMany(mappedBy = "importancia", fetch = FetchType.EAGER)
	private List<Contribuyente> contribuyentes;
	
	public Importancia() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_importancia() {
		return id_importancia;
	}

	public void setId_importancia(Integer id_importancia) {
		this.id_importancia = id_importancia;
	}

	public String getImportancia() {
		return importancia;
	}

	public void setImportancia(String importancia) {
		this.importancia = importancia;
	}

	public List<Contribuyente> getContribuyentes() {
		return contribuyentes;
	}

	public void setContribuyentes(List<Contribuyente> contribuyentes) {
		this.contribuyentes = contribuyentes;
	}
	
	
	
}
