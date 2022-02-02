package com.example.tienda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.tienda.models.productModel;
import com.example.tienda.repositories.productRepository;

@Service
@Repository
public class productService {
    @Autowired
    private productRepository productos;

    
    public List<productModel> listarProductos(){
        return productos.findAll();
    }
}
