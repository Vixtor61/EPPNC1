package com.uca.capas.ejpractico.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.ejpractico.dao.ContribuyenteDao;
import com.uca.capas.ejpractico.domain.Contribuyente;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService {
	@Autowired
	ContribuyenteDao contribuyenteDao;
	
	@Override
	public List<Contribuyente> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return contribuyenteDao.findAll();
	}
	
	@Override
	@Transactional
	public void save(Contribuyente contribuyente) throws DataAccessException {
		// TODO Auto-generated method stub
		contribuyenteDao.save(contribuyente);
	}
	
}
