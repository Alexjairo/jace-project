package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.EmpleadoJaceDao;
import com.jace.entity.Empleado;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	
	 @Autowired
     private EmpleadoJaceDao empleadoDao;
	
	@Override
	public List<Empleado> findAll() {
    return empleadoDao.findAll();
	}

	@Override
	public Optional<Empleado> findById(String cod_empleado) {

		return empleadoDao.findById(cod_empleado);
	}

	@Override
	public void save(Empleado empleado) {
       empleadoDao.save(empleado);		
	}

	@Override
	public void deleteById(String cod_empleado) {
		empleadoDao.deleteById(cod_empleado);
		
	}

}
