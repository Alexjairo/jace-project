package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.entity.Seguro;

public interface SeguroService {
	public List<Seguro> findAll();
	public Optional<Seguro> findById(String cod_seguro );
	public void save(Seguro seguro);
	public void deleteById(String seguro);
}
