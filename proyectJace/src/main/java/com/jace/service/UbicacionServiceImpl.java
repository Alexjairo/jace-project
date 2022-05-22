package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.UbicacionJaceDao;
import com.jace.entity.Ubicacion;
@Service
public class UbicacionServiceImpl implements UbicacionService {
	@Autowired
	private UbicacionJaceDao ubicacionDao;

	@Override
	public List<Ubicacion> findAll() {
		return ubicacionDao.findAll();
	}

	@Override
	public Optional<Ubicacion> findById(String cod_ubicacion) {
		return ubicacionDao.findById(cod_ubicacion);
	}

	@Override
	public void save(Ubicacion ubicacion) {
       ubicacionDao.save(ubicacion);
	}

	@Override
	public void deleteById(String cod_ubicacion) {
      ubicacionDao.deleteById(cod_ubicacion);
	}
}
