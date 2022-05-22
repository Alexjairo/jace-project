package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.SegurosJaceDao;
import com.jace.entity.Seguro;
@Service
public class SeguroServiceImpl implements SeguroService {

	@Autowired
	private SegurosJaceDao seguroDao;

	@Override
	public List<Seguro> findAll() {
		return seguroDao.findAll();
	}

	@Override
	public Optional<Seguro> findById(String cod_seguro) {
		return seguroDao.findById(cod_seguro);
	}

	@Override
	public void save(Seguro seguro) {
      seguroDao.save(seguro);
	}

	@Override
	public void deleteById(String seguro) {
       seguroDao.deleteById(seguro);
	}

}
