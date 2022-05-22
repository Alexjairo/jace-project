
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

import com.jace.entity.Envio;
import com.jace.service.EnvioService;



@CrossOrigin
@RestController
@RequestMapping("/apiJace")
public class EnvioJaceController {
	
	
	@Autowired
	private EnvioService envioService;
	
	@GetMapping("/envios")
	public List<Envio> findAll(){
		return envioService.findAll();
		
	}
	
	@GetMapping("/envio/{cod_envio}")
	public Optional<Envio> getEnvio(@PathVariable String cod_envio){
		Optional<Envio> envio = this.envioService.findById(cod_envio);
		if(envio == null) {
			throw new RuntimeException("No se encontro Envio"+ cod_envio);
		}
		
		return envio;
	}
	
	@PostMapping("/envioAdd")
	public Envio addEnvio(@RequestBody Envio envio) {
		envio.setCod_envio("0");
		envioService.save(envio);
		return envio;
	}
	
     @DeleteMapping("/enviodel/{cod_envio}")
     public String deleteEnvio(@PathVariable String cod_envio) {
       Optional<Envio> empleado = envioService.findById(cod_envio);
       if(empleado == null) {
    	   throw new  RuntimeException("Envio no encontrado"+ cod_envio);
       }
       envioService.deleteById(cod_envio);
       return "Delete envio"+ cod_envio;
     }
	
	

}
