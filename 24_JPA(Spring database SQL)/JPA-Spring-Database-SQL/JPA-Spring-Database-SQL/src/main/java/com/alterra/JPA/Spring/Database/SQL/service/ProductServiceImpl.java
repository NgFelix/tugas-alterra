package com.alterra.JPA.Spring.Database.SQL.service;

import com.alterra.JPA.Spring.Database.SQL.model.ProductModel;
import com.alterra.JPA.Spring.Database.SQL.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    // GET
    @Override
    public List<ProductModel> getAllProduct() {
        return (List<ProductModel>) productRepository.findAll();
    }
    // POST
    @Override
    public List<ProductModel> getNewProduct(ProductModel payload){
        return (List<ProductModel>) productRepository.save(payload);
    }
    @Override
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }




}
