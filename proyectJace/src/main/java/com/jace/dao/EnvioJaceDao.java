package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Envio;

@Repository
public interface EnvioJaceDao extends JpaRepository<Envio, String>{

}
