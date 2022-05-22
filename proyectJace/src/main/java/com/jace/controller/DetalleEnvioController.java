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


import com.jace.entity.Envio_Detalle;
import com.jace.service.Envio_DetalleService;

@CrossOrigin
@RestController
@RequestMapping("/apiJace") //raiz
public class DetalleEnvioController {
	
	@Autowired
	private Envio_DetalleService envioDetalleService;
	
	@GetMapping("/detalles")
	public List<Envio_Detalle> findAll(){
		return envioDetalleService.findAll();
	}
     
	@GetMapping("/detalle/{cod_envio}")
	public Optional<Envio_Detalle> getDetalle(@PathVariable String cod_envio){
		Optional<Envio_Detalle> detalle = this.envioDetalleService.findById(cod_envio);
		if(detalle == null) {
			throw new RuntimeException("Dettalle no encontrado"+ cod_envio);
		}
		
		return detalle;
	}
	@PostMapping("/detalleAdd")
	public Envio_Detalle addEmpleado(@RequestBody Envio_Detalle detalle) {
		detalle.setCod_envio("0");
		envioDetalleService.save(detalle);
		return detalle;
	}
	
	
	@DeleteMapping("/delDetalle/{cod_Envio}")
	public String deteleDetalle(@PathVariable String cod_envio) {
		Optional<Envio_Detalle> detalle = envioDetalleService.findById(cod_envio);
		if(detalle ==null) {
			throw new RuntimeException("no se pudo encontrar el detalle"+ cod_envio);
		}
		envioDetalleService.deleteById(cod_envio);
		
		return "Delete detalle"+ cod_envio;
	}
	
}
