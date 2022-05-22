package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Vehiculo;

@Repository
public interface VehiculoJaceDao extends JpaRepository<Vehiculo, String> {

}
