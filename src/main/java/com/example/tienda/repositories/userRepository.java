package com.example.tienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tienda.models.userModel;
@Repository
public interface userRepository extends JpaRepository<userModel, Integer> {
    
}
