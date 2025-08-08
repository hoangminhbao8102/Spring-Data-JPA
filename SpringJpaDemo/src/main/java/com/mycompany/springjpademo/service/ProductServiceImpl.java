/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springjpademo.service;

import com.mycompany.springjpademo.model.Product;
import com.mycompany.springjpademo.repository.ProductRepository;
import java.util.List;

/**
 *
 * @author 20113
 */
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> getAll() {
        return repo.findAll();
    }

    @Override
    public Product getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return repo.save(product);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
