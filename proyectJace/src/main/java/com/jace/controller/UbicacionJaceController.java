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

import com.jace.entity.Ubicacion;
import com.jace.service.UbicacionService;


@CrossOrigin
@RestController
@RequestMapping("/apiJace")
public class UbicacionJaceController {
	@Autowired
	private UbicacionService ubicacionService;
	
	@GetMapping("/ubicacion")
	public List<Ubicacion> findAll(){
		return ubicacionService.findAll();
		
	}
	
	@GetMapping("/ubicacion/{vehiculo}")
	public Optional<Ubicacion> getFactura(@PathVariable String vehiculo){
		Optional<Ubicacion> factura = this.ubicacionService.findById(vehiculo);
		if(factura == null) {
			throw new RuntimeException("No se encontro Ubicación"+ vehiculo);
		}
		
		return factura;
	}
	
//	@PostMapping("/UbicacionAdd")
//	public Ubicacion addFactura(@RequestBody Ubicacion ubicacion) {
//		ubicacion.setVehiculo(null);
//		ubicacionService.save(ubicacion);
//		
//		return ubicacion;
//	}
	
     @DeleteMapping("/Ubicacion/{vehiculo}")
     public String deleteEnvio(@PathVariable String vehiculo) {
       Optional<Ubicacion> ubicacion = ubicacionService.findById(vehiculo);
       if(ubicacion == null) {
    	   throw new  RuntimeException("Ubicación no encontrado"+ vehiculo);
       }
       ubicacionService.deleteById(vehiculo);
       return "Delete Ubi"+ vehiculo;
     }

}
