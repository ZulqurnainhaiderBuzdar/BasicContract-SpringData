/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.spring_data12.repositories;
import com.example.spring_data12.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Cv
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
    
}
