/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring_data12.controller;

import com.example.spring_data12.entities.Product;
import com.example.spring_data12.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cv
 */
@RestController
public class ProductController {
    
    @Autowired
    private ProductRepository  productRepository;
    
    @GetMapping("/sort")
    public Iterable<Product> getAllSortedDescendingById(){
      return   productRepository.findAll(Sort.by("id").descending());
    }
    
    
}
