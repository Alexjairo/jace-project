package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Cargo;

@Repository
public interface CargoJaceDao extends JpaRepository<Cargo, String> {

}
