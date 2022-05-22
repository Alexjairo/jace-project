package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Empleado;

@Repository
public interface EmpleadoJaceDao extends JpaRepository<Empleado, String> {

}
