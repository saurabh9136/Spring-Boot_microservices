package com.prodmanage2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodmanage2.entity.Product;
import com.prodmanage2.repository.ProductRepository;

@RestController

@RequestMapping("/product")	// giving this class url as product
public class ProductController {

	@Autowired
	private ProductRepository productRepository; // using repository to use operations
	
	@GetMapping("/all")
	public List<Product> getAll() // fetching all data withing table 
	{
		return productRepository.findAll();
	}
	
	
	@GetMapping("/id/{pid}")
	public Product fidnById(@PathVariable int pid) // fetching data by id
	{
		return productRepository.findById(pid).get();
	}
}
