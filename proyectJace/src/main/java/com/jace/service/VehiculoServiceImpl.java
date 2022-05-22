package com.jace.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.VehiculoJaceDao;
import com.jace.entity.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService {

	@Autowired
	private VehiculoJaceDao vehiculoDao;

	@Override
	public List<Vehiculo> findAll() {
		return vehiculoDao.findAll();
	}

	@Override
	public Optional<Vehiculo> findById(String cod_vehiculo) {
		return vehiculoDao.findById(cod_vehiculo);
	}

	@Override
	public void save(Vehiculo vehiculo) {
		vehiculoDao.save(vehiculo);
	}

	@Override
	public void deleteById(String cod_vehiculo) {
		vehiculoDao.deleteById(cod_vehiculo);
	}
}
