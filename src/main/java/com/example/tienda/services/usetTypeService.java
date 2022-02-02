package com.example.tienda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import com.example.tienda.models.userTypeModel;
import com.example.tienda.repositories.userTypeRepository;


@Service
@Repository
public class usetTypeService {
    @Autowired
    public userTypeRepository typeUser;
    
    public List<userTypeModel> listarTipoUsuarios(){
        return typeUser.findAll();


    }
}
