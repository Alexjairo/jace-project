package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Ubicacion;

@Repository
public interface UbicacionJaceDao extends JpaRepository<Ubicacion,String>{

}
