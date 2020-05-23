package com.uca.capas.ejpractico.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.ejpractico.domain.Importancia;

public interface ImportanciaService {
	public List<Importancia>findAll() throws DataAccessException;
	public Importancia findOne(Integer code) throws DataAccessException;

}
