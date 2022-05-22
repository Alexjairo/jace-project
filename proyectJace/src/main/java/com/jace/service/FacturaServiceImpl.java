package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.FacturaJaceDao;
import com.jace.entity.Factura;
@Service
public class FacturaServiceImpl implements FacturaService {
	@Autowired
	private FacturaJaceDao facturaDao;

	@Override
	public List<Factura> findAll() {
		return facturaDao.findAll();
	}

	@Override
	public Optional<Factura> findById(String cod_factura) {
		return facturaDao.findById(cod_factura);
	}

	@Override
	public void save(Factura factura) {
		facturaDao.save(factura);
	}

	@Override
	public void deleteById(String cod_factura) {
       facturaDao.deleteById(cod_factura);
	}
}
