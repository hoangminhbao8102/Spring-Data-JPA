/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.springjpademo.service;

import com.mycompany.springjpademo.model.Product;
import java.util.List;

/**
 *
 * @author 20113
 */
public interface ProductService {
    List<Product> getAll();
    Product getById(Long id);
    Product save(Product product);
    void delete(Long id);
}
