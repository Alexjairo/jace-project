package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.EnvioJaceDao;
import com.jace.entity.Envio;
@Service
public class EnvioServiceImpl implements EnvioService {
	@Autowired
	private EnvioJaceDao envioDao;

	@Override
	public List<Envio> findAll() {
		return envioDao.findAll();
	}

	@Override
	public Optional<Envio> findById(String envio) {
		return envioDao.findById(envio);
	}

	@Override
	public void save(Envio envio) {
       envioDao.save(envio);
	}

	@Override
	public void deleteById(String cod_envio) {
     envioDao.deleteById(cod_envio);
	}


}
