package com.jace.service;

import java.util.List;
import java.util.Optional;

import com.jace.entity.Terminal;

public interface TerminalService {
	public List<Terminal> findAll();
	public Optional<Terminal> findById(String cod_terminal );
	public void save(Terminal teerminal);
	public void deleteById(String cod_terminal);
}
