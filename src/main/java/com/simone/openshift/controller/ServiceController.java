package com.simone.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simone.openshift.model.Contatto;

@RestController
public class ServiceController {
	@RequestMapping("api")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario","Rossi","mario"));
		lista.add(new Contatto("Paolo","Neri","paolo"));
		lista.add(new Contatto("Anna","Verdi","anna"));
		return lista;
	}
}
