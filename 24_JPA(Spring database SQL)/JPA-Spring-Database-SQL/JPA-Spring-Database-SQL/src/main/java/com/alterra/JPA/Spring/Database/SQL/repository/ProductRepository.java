package com.alterra.JPA.Spring.Database.SQL.repository;

import com.alterra.JPA.Spring.Database.SQL.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, Long> {

}
