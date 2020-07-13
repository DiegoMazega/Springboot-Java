package com.diegomazega.myfirstfroject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegomazega.myfirstfroject.entities.Product;
import com.diegomazega.myfirstfroject.repositories.ProductRepository;

@RestController //Informa que é um tipo de requisição Rest
@RequestMapping(value = "/products") // Informa a rota para usar ela
public class ProductResource {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping //Diz que é uma requisição Get
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productRepository.findAll();
		return ResponseEntity.ok().body(list); // Retorna com codigo da familia 200 e já no formato Json
	}
	
	@GetMapping(value = "/{id}") // requisição Get com um route parameter
	public ResponseEntity<Product>findById(@PathVariable Long id){
		Product prod = productRepository.findById(id).get();
		return ResponseEntity.ok().body(prod);
	}
}
