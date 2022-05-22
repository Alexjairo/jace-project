package com.jace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jace.entity.Seguro;
import com.jace.service.SeguroService;


@CrossOrigin
@RestController
@RequestMapping("/apiJace")
public class SeguroJaceController {
	
	
	@Autowired
	private SeguroService seguroService;
	
	@GetMapping("/seguros")
	public List<Seguro> findAll(){
		return seguroService.findAll();
		
	}
	
	@GetMapping("/seguro/{cod_seguro}")
	public Optional<Seguro> getFactura(@PathVariable String cod_seguro){
		Optional<Seguro> seguro = this.seguroService.findById(cod_seguro);
		if(seguro == null) {
			throw new RuntimeException("No se encontro el seguro"+ cod_seguro);
		}
		
		return seguro;
	}
	
	@PostMapping("/seguroAdd")
	public Seguro addSeguro(@RequestBody Seguro seguro) {
		seguro.setCod_seguros("0");
		seguroService.save(seguro);
		
		return seguro;
	}
	
     @DeleteMapping("/seguro/{cod_seguro}")
     public String deleteSeguro(@PathVariable String cod_seguro) {
       Optional<Seguro> seguro = seguroService.findById(cod_seguro);
       if(seguro == null) {
    	   throw new  RuntimeException("seguro no encontrado"+ cod_seguro);
       }
       seguroService.deleteById(cod_seguro);
       return "Delete factura"+ cod_seguro;
     }

}
