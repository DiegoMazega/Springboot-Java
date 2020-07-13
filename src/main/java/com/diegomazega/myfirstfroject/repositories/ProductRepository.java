package com.diegomazega.myfirstfroject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegomazega.myfirstfroject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
