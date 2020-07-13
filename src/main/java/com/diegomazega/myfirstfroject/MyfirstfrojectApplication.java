package com.diegomazega.myfirstfroject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diegomazega.myfirstfroject.entities.Category;
import com.diegomazega.myfirstfroject.entities.Product;
import com.diegomazega.myfirstfroject.repositories.CategoryRepository;
import com.diegomazega.myfirstfroject.repositories.ProductRepository;

@SpringBootApplication
public class MyfirstfrojectApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstfrojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		
		Product prod1 = new Product(null, "TV", 2200.00, cat1);
		Product prod2 = new Product(null, "Designer Partners", 120.00, cat2);
		Product prod3 = new Product(null, "Xbox X", 3000.00, cat1);
		Product prod4 = new Product(null, "Docker", 100.00, cat2);
		
		cat1.getProducts().addAll(Arrays.asList(prod1,prod3));
		cat2.getProducts().addAll(Arrays.asList(prod2, prod4));
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
		productRepository.save(prod1);
		productRepository.save(prod2);
		productRepository.save(prod3);
		productRepository.save(prod4);
	}

}
