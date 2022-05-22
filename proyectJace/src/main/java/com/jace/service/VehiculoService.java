package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jace.entity.Vehiculo;
@Service
public interface VehiculoService {
	public List<Vehiculo> findAll();
	public Optional<Vehiculo> findById(String cod_vehiculo );
	public void save(Vehiculo vehiculo);
	public void deleteById(String cod_vehiculo);
}
