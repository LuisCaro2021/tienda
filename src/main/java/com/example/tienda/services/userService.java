package com.example.tienda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.tienda.models.userModel;
import com.example.tienda.repositories.userRepository;

@Service
@Repository
public class userService {
    @Autowired
    public userRepository usuarios; 
    
    public List<userModel> listarUsuarios(){
        return usuarios.findAll();
        


    }

}
