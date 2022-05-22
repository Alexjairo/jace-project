package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.dao.EnvioJaceDao;
import com.jace.entity.Envio;


public interface EnvioService {
	public List<Envio> findAll();
	public Optional<Envio> findById(String code_envio );
	public void save(Envio envio);
	public void deleteById(String  cod_envio);
}
