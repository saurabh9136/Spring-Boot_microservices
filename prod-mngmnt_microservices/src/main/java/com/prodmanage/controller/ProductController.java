package com.prodmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prodmanage.entity.Product;
import com.prodmanage.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/new")
	// create
	public Product createProduct(@RequestBody Product product)
	{
		return productRepository.save(product);
	}
	
	@PutMapping("/update/{pid}")
	// update
	public Product updateProduct(@PathVariable int pid ,@RequestBody Product product) {
		Product _Product = productRepository.findById(pid).get();
		_Product.setPname(product.getPname());// set the new name
	   _Product.setPrice(product.getPrice()); // set the new price
	    
	    return productRepository.save(_Product);
	} 
	
	@DeleteMapping("/remove/{pid}")
	// delete
	public String deleteProduct(@PathVariable int pid)
	{
		productRepository.deleteById(pid);
		return "product wit Id:"+pid+"has been deleted";
	}
}
