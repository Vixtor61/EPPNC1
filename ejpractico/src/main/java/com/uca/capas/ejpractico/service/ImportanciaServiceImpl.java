package com.uca.capas.ejpractico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.ejpractico.dao.ImportanciaDao;
import com.uca.capas.ejpractico.domain.Importancia;

@Service
public class ImportanciaServiceImpl implements ImportanciaService {
	@Autowired
	ImportanciaDao importanciaDao;
	
	@Override
	public List<Importancia> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return importanciaDao.findAll();
		
	}
	
	@Override
	public Importancia findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return importanciaDao.findOne(code);
	}
}
