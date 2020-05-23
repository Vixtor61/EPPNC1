package com.uca.capas.ejpractico.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.ejpractico.domain.Contribuyente;

public interface ContribuyenteDao {
	public List<Contribuyente> findAll() throws DataAccessException;
	//public Estudiante findOne(Integer code) throws DataAccessException;
	//public void insert(Estudiante estudiante) throws DataAccessException;
	public void save(Contribuyente contribuyente) throws DataAccessException;
	//public void delete(Integer codigoEstudiante)throws DataAccessException;
}
