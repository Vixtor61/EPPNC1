package com.uca.capas.ejpractico.controller;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.ejpractico.domain.Contribuyente;
import com.uca.capas.ejpractico.domain.Importancia;
import com.uca.capas.ejpractico.service.ContribuyenteService;
import com.uca.capas.ejpractico.service.ImportanciaService;
@Controller
public class MainController {
	@Autowired
	private ContribuyenteService contribuyenteService;
	@Autowired
	private ImportanciaService importanciaService ;
	
	@RequestMapping("/")
	public ModelAndView Main() {
		ModelAndView mav = new ModelAndView();
		Contribuyente contribuyente = new Contribuyente();
		
		List<Importancia> importancias= null;
		try {
			
			importancias = importanciaService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("importancias",importancias);
		mav.addObject("contribuyente",contribuyente);
		mav.setViewName("main");
		return mav;
	}
	
	
	@PostMapping("/save")
	public ModelAndView guardar(@Valid @ModelAttribute Contribuyente contribuyente,BindingResult result,@RequestParam Integer idimp) {
		
		ModelAndView mav = new ModelAndView();
		
		Calendar newdate = Calendar.getInstance();
		contribuyente.setFecha_ingreso(newdate);
		List<Importancia> importancias= null;
		try {
			
			importancias = importanciaService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("importancias",importancias);
		
		
		if (result.hasErrors()) {
			
			mav.setViewName("main");
			
		} else {
			

			try {
				Importancia imp  =  importanciaService.findOne(idimp);
				contribuyente.setImportancia(imp);
				
				contribuyenteService.save(contribuyente);
			} catch (Exception e) {
				e.printStackTrace();
			}
			mav.setViewName("main");
			

		}
		
		return mav;
	}
	
	@RequestMapping("/listado")
	public ModelAndView  list(){

				
				
					
		ModelAndView mav = new ModelAndView();
		
		
		List<Contribuyente> contribuyentes= null;
		try {
			
			contribuyentes = contribuyenteService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("contribuyentes",contribuyentes);
		
		mav.setViewName("list");
		

		return mav;
	}
	/*
	@RequestMapping("/impo")
	public ModelAndView  ilist(){

				
				
					
		ModelAndView mav = new ModelAndView();
		
		
		List<Importancia> importancias= null;
		try {
			
			importancias = importanciaService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("importancias",importancias);
		
		mav.setViewName("list");
		

		return mav;
	}
	
	*/
	
	

}
