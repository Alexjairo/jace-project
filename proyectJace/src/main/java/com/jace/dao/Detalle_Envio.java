package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Envio_Detalle;

@Repository
public interface Detalle_Envio extends JpaRepository<Envio_Detalle, String> {

}
