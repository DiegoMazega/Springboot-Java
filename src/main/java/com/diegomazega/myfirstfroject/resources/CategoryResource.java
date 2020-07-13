package com.diegomazega.myfirstfroject.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegomazega.myfirstfroject.entities.Category;
import com.diegomazega.myfirstfroject.repositories.CategoryRepository;

@RestController //Informa que é um tipo de requisição Rest
@RequestMapping(value = "/categories") // Informa a rota para usar ela
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping //Diz que é uma requisição Get
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list); // Retorna com codigo da familia 200 e já no formato Json
	}
	
	@GetMapping(value = "/{id}") // requisição Get com um route parameter
	public ResponseEntity<Category>findById(@PathVariable Long id){
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}
