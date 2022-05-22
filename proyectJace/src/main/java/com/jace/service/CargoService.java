package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.entity.Cargo;

public interface CargoService {
	public List<Cargo> findAll();
	public Optional<Cargo> findById(String cod_cargo);
	public void save(Cargo cargo);
	public void deleteById(String cod_cargo);

}
