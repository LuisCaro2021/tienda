package com.example.tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tienda.models.userTypeModel;
@Repository
public interface userTypeRepository extends JpaRepository<userTypeModel, Integer>{
    
}
