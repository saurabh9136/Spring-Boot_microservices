package com.prodmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<com.prodmanage.entity.Product, Integer> {

}
