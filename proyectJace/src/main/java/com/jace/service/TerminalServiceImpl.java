package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jace.dao.TerminalJaceDao;
import com.jace.entity.Terminal;
@Service
public class TerminalServiceImpl implements TerminalService {
	@Autowired
	private TerminalJaceDao terminalDao;

	@Override
	public List<Terminal> findAll() {
		return terminalDao.findAll();
	}

	@Override
	public Optional<Terminal> findById(String cod_terminal) {
		return terminalDao.findById(cod_terminal);
	}

	@Override
	public void save(Terminal terminal) {
		terminalDao.save(terminal);
	}

	@Override
	public void deleteById(String cod_terminal) {
		terminalDao.deleteById(cod_terminal);
	}

}
