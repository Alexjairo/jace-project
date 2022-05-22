package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.*;
import com.jace.entity.Cargo;

@Service
public class CargoServiceImpl implements CargoService{

	 @Autowired
	 private CargoJaceDao cargoDao;
	 
	@Override
	public List<Cargo> findAll() {
		return cargoDao.findAll();
	}

	@Override
	public Optional<Cargo> findById(String cod_cargo) {
		return cargoDao.findById(cod_cargo);
	}

	@Override
	public void save(Cargo cargo) {
     cargoDao.save(cargo);
	}

	@Override
	public void deleteById(String cod_cargo) {
		// TODO Auto-generated method stub
		
	}

}
