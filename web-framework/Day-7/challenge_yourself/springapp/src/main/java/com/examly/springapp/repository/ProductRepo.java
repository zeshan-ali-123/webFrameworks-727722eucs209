package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    public List<Product> findByProductCategory(String productCategory);
    public List<Product> findByPriceCategory(String priceCategory);

}
