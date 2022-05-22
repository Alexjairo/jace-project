package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.entity.Ubicacion;

public interface UbicacionService {
	public List<Ubicacion> findAll();
	public Optional<Ubicacion> findById(String cod_ubicacion  );
	public void save(Ubicacion ubicacion);
	public void deleteById(String cod_ubicacion);
}
