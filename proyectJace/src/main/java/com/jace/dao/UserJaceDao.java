package com.jace.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jace.entity.User;


@Repository
//@RepositoryRestResource(path="prueba")
public interface UserJaceDao extends JpaRepository<User, String>{

}
