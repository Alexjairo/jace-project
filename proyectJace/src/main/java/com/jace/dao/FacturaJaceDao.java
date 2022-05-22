package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Factura;

@Repository
public interface FacturaJaceDao extends JpaRepository<Factura, String>{

}
