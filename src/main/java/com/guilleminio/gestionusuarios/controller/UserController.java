package com.guilleminio.gestionusuarios.controller;

import com.guilleminio.gestionusuarios.models.UserDTO;
import com.guilleminio.gestionusuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    UserService mUserService;

    public UserController( UserService aUserService){
        this.mUserService = aUserService;
    }

    @PostMapping("/users")
    private UserDTO saveUser(@RequestBody UserDTO aUserDTO){

            return mUserService.saveUser(aUserDTO);

    }

    @GetMapping("/users")
    private List<UserDTO> fetchUsers()
    {
       return mUserService.fetchAllUsers();
    }

    // Update operation
    @PutMapping("/users/{id}")
    public UserDTO updateUser(@RequestBody UserDTO userDTO,
                              @PathVariable("id") Integer userId)
    {

        return mUserService.updateUser(
                userDTO, userId);
    }

    // Delete operation
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable("id")
                                       Integer userId)
    {

        mUserService.deleteUser(
                userId);
        return "Deleted Successfully";
    }

}
