package com.prodmanage2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodmanage2.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
