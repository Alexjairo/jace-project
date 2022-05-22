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

import com.jace.entity.Empleado;
import com.jace.service.EmpleadoService;

@CrossOrigin
@RestController
@RequestMapping("/apiJace")//raiz
public class EmpleadoJaceController {
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	public List<Empleado> findAll(){
		return empleadoService.findAll();
	}
	@GetMapping("/empleado/{EmpDni}")
	public Optional<Empleado> getEmpleado(@PathVariable String EmpDni){
		Optional<Empleado> empleado = this.empleadoService.findById(EmpDni);
		if(empleado == null) {
			throw new RuntimeException("No se encontro el empleado"+ EmpDni);
		}
		
		return empleado;
	}
	
	@PostMapping("/empleadoAdd")
	public Empleado addEmpleado(@RequestBody Empleado empleado) {
		empleado.setDni("0");
		empleadoService.save(empleado);
		return empleado;
	}
	
     @DeleteMapping("/empleadodel/{empDni}")
     public String deleteEmpleado(@PathVariable String EmpDni) {
       Optional<Empleado> empleado = empleadoService.findById(EmpDni);
       if(empleado == null) {
    	   throw new  RuntimeException("empleado no encontrado"+ EmpDni);
       }
       empleadoService.deleteById(EmpDni);
       return "Delete empl"+ EmpDni;
     }
}
