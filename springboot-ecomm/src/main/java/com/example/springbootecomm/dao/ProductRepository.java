package com.example.springbootecomm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.springbootecomm.entity.Product;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long>{

}
