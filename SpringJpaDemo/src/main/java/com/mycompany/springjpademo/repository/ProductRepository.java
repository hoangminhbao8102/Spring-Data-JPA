/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.springjpademo.repository;

import com.mycompany.springjpademo.dto.ProductDto;
import com.mycompany.springjpademo.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author 20113
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String keyword);

    @Query("SELECT new com.mycompany.springjpademo.dto.ProductDto(p.name, p.price) FROM Product p WHERE p.price > :minPrice")
    List<ProductDto> findCustomProducts(@Param("minPrice") double minPrice);
}
