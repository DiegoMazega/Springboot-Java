package com.diegomazega.myfirstfroject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegomazega.myfirstfroject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
