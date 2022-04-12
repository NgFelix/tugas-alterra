package com.alterra.JPA.Spring.Database.SQL.service;

import com.alterra.JPA.Spring.Database.SQL.model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    List<ProductModel> getAllProduct();
    List<ProductModel> getNewProduct(ProductModel payload);
    void deleteProductById(Long id);

}
