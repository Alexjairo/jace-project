package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.Detalle_Envio;
import com.jace.entity.Envio_Detalle;
@Service
public class Envio_DetalleServiceImpl implements Envio_DetalleService {
@Autowired
private Detalle_Envio detalleDao;

@Override
public List<Envio_Detalle> findAll() {
	return detalleDao.findAll();
}

@Override
public Optional<Envio_Detalle> findById(String cod_envio) {
	return detalleDao.findById(cod_envio);
}

@Override
public void save(Envio_Detalle detalleEnvio) {
	detalleDao.save(detalleEnvio);
	
}

@Override
public void deleteById(String cod_envio) {
    detalleDao.deleteById(cod_envio);	
}




}
