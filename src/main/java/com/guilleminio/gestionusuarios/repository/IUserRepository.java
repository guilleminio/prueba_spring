package com.guilleminio.gestionusuarios.repository;

import com.guilleminio.gestionusuarios.models.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<UserDTO,Integer> {
}
