package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.entity.Envio_Detalle;

public interface Envio_DetalleService {
	public List<Envio_Detalle> findAll();
	public Optional<Envio_Detalle> findById(String cod_envio);
	public void save(Envio_Detalle detalleEnvio);
	public void deleteById(String cod_envio);
}
