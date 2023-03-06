package com.guilleminio.gestionusuarios.repository;

import com.guilleminio.gestionusuarios.models.UserDTO;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserDTO,Integer> {
}
