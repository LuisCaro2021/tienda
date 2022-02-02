package com.example.tienda.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tienda.models.productModel;

@Repository
public interface productRepository extends JpaRepository<productModel,Integer>{

}
