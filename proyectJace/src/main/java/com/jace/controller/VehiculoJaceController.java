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

import com.jace.entity.Vehiculo;
import com.jace.service.VehiculoService;


@CrossOrigin
@RestController
@RequestMapping("/apiJace")

public class VehiculoJaceController {
	@Autowired
	private VehiculoService vehiculoService;

	@GetMapping("/vehiculos")
	public List<Vehiculo> findAll() {
		return vehiculoService.findAll();

	}

	@GetMapping("/vehiculo/{num_matricula}")
	public Optional<Vehiculo> getVehiculo(@PathVariable String num_matricula) {
		Optional<Vehiculo> vehiculo = this.vehiculoService.findById(num_matricula);
		if (vehiculo == null) {
			throw new RuntimeException("No se encontro el vehiculo" + num_matricula);
		}

		return vehiculo;
	}

	@PostMapping("/VehiculoAdd")
	public Vehiculo addVehiculo(@RequestBody Vehiculo vehiculo) {
		vehiculo.setMatricula("0");
		vehiculoService.save(vehiculo);

		return vehiculo;
	}

	@DeleteMapping("/vehiculoDel/{num_matricula}")
	public String deleteVehiculo(@PathVariable String num_matricula) {
		Optional<Vehiculo> vehiculo = vehiculoService.findById(num_matricula);
		if (vehiculo == null) {
			throw new RuntimeException("vehiculo no encontrado" + num_matricula);
		}
		vehiculoService.deleteById(num_matricula);
		return "Delete matrticula" + num_matricula;
	}

}
