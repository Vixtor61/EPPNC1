package com.uca.capas.ejpractico.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.ejpractico.domain.Importancia;

public interface ImportanciaDao {
	public List<Importancia> findAll() throws DataAccessException;
	public Importancia findOne(Integer code) throws DataAccessException;
}
