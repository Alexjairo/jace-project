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

import com.jace.entity.Factura;
import com.jace.service.FacturaService;


@CrossOrigin
@RestController
@RequestMapping("/apiJace")
public class FacturaJaceController {
	@Autowired
	private FacturaService facturaService;
	
	@GetMapping("/facturas")
	public List<Factura> findAll(){
		return facturaService.findAll();
		
	}
	
	@GetMapping("/factura/{num_factura}")
	public Optional<Factura> getFactura(@PathVariable String num_factura){
		Optional<Factura> factura = this.facturaService.findById(num_factura);
		if(factura == null) {
			throw new RuntimeException("No se encontro Factura"+ num_factura);
		}
		
		return factura;
	}
	
	@PostMapping("/FacturaAdd")
	public Factura addFactura(@RequestBody Factura num_factura) {
		num_factura.setNum_factura("0");
		facturaService.save(num_factura);
		
		return num_factura;
	}
	
     @DeleteMapping("/Factura/{num_factura}")
     public String deleteEnvio(@PathVariable String num_factura) {
       Optional<Factura> factura = facturaService.findById(num_factura);
       if(factura == null) {
    	   throw new  RuntimeException("Factura no encontrado"+ num_factura);
       }
       facturaService.deleteById(num_factura);
       return "Delete factura"+ num_factura;
     }
}
