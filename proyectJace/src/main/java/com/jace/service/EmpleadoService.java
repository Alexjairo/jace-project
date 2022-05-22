package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.entity.Empleado;


public interface EmpleadoService {
	public List<Empleado> findAll();
	public Optional<Empleado> findById(String cod_empleado);
	public void save(Empleado empleado);
	public void deleteById(String cod_empleado);
}
