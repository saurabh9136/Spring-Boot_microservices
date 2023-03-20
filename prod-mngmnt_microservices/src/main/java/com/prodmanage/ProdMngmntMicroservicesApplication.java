package com.prodmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodmanage.entity.Product;
import com.prodmanage.repository.ProductRepository;

@SpringBootApplication
public class ProdMngmntMicroservicesApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProdMngmntMicroservicesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception 
	{
		Product p1 = Product.builder().pname("samsung").price("450000").build();
		Product p2 = Product.builder().pname("Sony").price("650000").build();
		Product p3 = Product.builder().pname("Xiomi").price("250000").build();
		Product p4 = Product.builder().pname("LG").price("400000").build();
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		
	}
}
