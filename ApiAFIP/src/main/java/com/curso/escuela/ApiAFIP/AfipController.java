package com.curso.escuela.ApiAFIP;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AfipController {
	@Autowired
	AfipRepository Repo;


	@GetMapping("/IGanancias/liquidacion/{fecha1}/{fecha2}")
		public List<Impuestos>getFechasLiquidacion(@PathVariable Date fecha1, Date fecha2){
		List<Impuestos> l= Repo.findByCreatedDateBetween(fecha1, fecha2);
		return l;
	}
	
	@GetMapping("/Impuestos/{nmrofiscal}")
		public List<Impuestos>getImpuestosByNmroFiscal(@PathVariable Long nmrofiscal){
		
		return Repo.findAllByNmroFiscal(nmrofiscal);
	}
	
}
