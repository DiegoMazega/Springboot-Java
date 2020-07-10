package com.diegomazega.myfirstfroject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.diegomazega.myfirstfroject.entities.Category;

@Component //stereoType
public class CategoryRepository {
	
	private Map<Long, Category> map = new HashMap<>();	
	
	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
		
	}
	
}
