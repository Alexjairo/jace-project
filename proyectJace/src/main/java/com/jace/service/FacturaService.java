package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.entity.Factura;

public interface FacturaService {
	public List<Factura> findAll();
	public Optional<Factura> findById(String  cod_factura);
	public void save(Factura factura);
	public void deleteById(String cod_factura );
}
