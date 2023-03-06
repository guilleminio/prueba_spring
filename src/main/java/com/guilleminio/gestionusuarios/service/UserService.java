package com.guilleminio.gestionusuarios.service;

import com.guilleminio.gestionusuarios.models.UserDTO;
import com.guilleminio.gestionusuarios.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired IUserRepository mIUserRepository;

    public UserDTO saveUser(UserDTO aUserDTO) {
         return  mIUserRepository.save(aUserDTO);
    }

    public List<UserDTO> fetchAllUsers() {
        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        mIUserRepository.findAll().forEach(userDTOS::add);
        return userDTOS;
    }

    public UserDTO updateUser(UserDTO aUserDTO, Integer aUserId) {
        //No debe ser así,  pero  solo estoy haciendo pruebas
        return mIUserRepository.save(aUserDTO);
    }

    public void deleteUser(Integer aUser) {
        mIUserRepository.deleteById(aUser);
    }
}
