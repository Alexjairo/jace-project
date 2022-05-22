package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jace.entity.Seguro;

@Repository
public interface SegurosJaceDao extends JpaRepository<Seguro, String>{

}
