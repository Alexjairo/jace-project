package com.jace.controller;

import com.jace.entity.Cargo;
import com.jace.entity.User;
import com.jace.service.*;

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

import com.jace.service.CargoService;

@CrossOrigin
@RestController
@RequestMapping("/apiJace") // raiz

public class CargoJaceController {
	@Autowired
	private CargoService cargoService;

	@GetMapping("/cargoList")
	public List<Cargo> findAll() {
		return cargoService.findAll();

	}
	
	@GetMapping("/cargo/{cod_cargo}")
	public Optional<Cargo> getCargo(@PathVariable String cod_cargo) {
		Optional<Cargo> cargo = this.cargoService.findById(cod_cargo);
		if(cargo == null) {
			throw new RuntimeException("Cargo not found-"+ cod_cargo);
		}
		return cargo;
	}
	
	
	@PostMapping("/addCargo")
	public Cargo addCargo(@RequestBody Cargo cargo) {
		cargo.setCod_cargo("0");
		cargoService.save(cargo);
		return cargo;
	}
	
	@DeleteMapping("/cargoDelete/{cod_cargo}")
	public String deleteCargo(@PathVariable String cod_cargo) {
		Optional<Cargo> cargo = cargoService.findById(cod_cargo);
		if(cargo == null) {
			throw new RuntimeException("Cargo not Found"+ cod_cargo);
		}
		cargoService.deleteById("cod_cargo");
		
		return "Delete Cargo: "+ cod_cargo; 
		
	}
}
